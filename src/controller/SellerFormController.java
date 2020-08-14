package controller;
import model.Address;
import view.UIDelegate;

public class SellerFormController implements UIDelegate {

	private String name;
	private String phone;
	private String email;
	private Address addres;
	
	@Override
	public void saveBasicInformationClicked(String name, String email, String phone) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public void saveAddressClicked(String zipCode, String country, String state, String city, String neighborhood,
			String street, String number) {
		addres = new Address(zipCode, country, state, city, neighborhood, street, number);
	}
}
