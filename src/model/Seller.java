package model;

import org.bson.types.ObjectId;

public class Seller {
	
	// MARK: - Private
	private ObjectId _id;
	private String name;
	private String email;
	private String phone;
	private Address address;
	private Product[] products;
	
	// MARK: - Init
	
	public Seller(
			ObjectId id,
			String name,
			String email,
			String phone,
			Address address,
			Product[] products
			) {
		this._id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.products = products;
	}
	
	public Seller() {}
	
	// MARK: - Public
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
