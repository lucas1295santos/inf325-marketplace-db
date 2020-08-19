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
		this.set_id(id);
		this.setName(name);
		this.setEmail(email);
		this.setPhone(phone);
		this.setAddress(address);
		this.setProducts(products);
	}
	
	public Seller() {}
	
	// MARK: - Public
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
}
