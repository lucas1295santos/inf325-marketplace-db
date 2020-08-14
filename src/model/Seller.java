package model;

public class Seller {
	
	// MARK: - Private
	private String id;
	private String name;
	private String email;
	private String phone;
	private Address address;
	private Product[] products;
	
	// MARK: - Init
	
	public Seller(
			String id,
			String name,
			String email,
			String phone,
			Address address,
			Product[] products
			) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.products = products;
	}
	
	// MARK: - Public
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
