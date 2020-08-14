package controller;
import java.util.List;

import com.google.gson.Gson;

import java.util.ArrayList;

import model.*;
import view.FormViewDelegate;

public class SellerFormController implements FormViewDelegate {

	private String name;
	private String phone;
	private String email;
	private Address address;
	List<Product> products = new ArrayList<Product>();
	
	@Override
	public void saveBasicInformationClicked(String name, String email, String phone) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public void saveAddressClicked(String zipCode, String country, String state, String city, String neighborhood,
			String street, String number) {
		address = new Address(zipCode, country, state, city, neighborhood, street, number);
	}

	@Override
	public void addProductClicked(String name, String description, int priceInCents) {
		products.add(new Product(null, name, description, priceInCents));
	}

	@Override
	public void saveSellerClicked() {
		Product[] productsArray = new Product[products.size()];
		products.toArray(productsArray);
		Seller seller = new Seller(null, name, email, phone, address, productsArray);
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(seller));
		
		// TODO Send to the data layer to save on DB
	}
}
