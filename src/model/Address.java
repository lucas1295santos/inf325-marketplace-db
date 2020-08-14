package model;

public class Address {
	// MARK: - Private
		private String zipCode;
		private String country;
		private String state;
		private String city;
		private String neighborhood;
		private String street;
		private String number;
		
		// MARK: - Init
		public Address(
				String zipCode,
				String country,
				String state,
				String city,
				String neighborhood,
				String street,
				String number
				) {
			this.zipCode = zipCode;
			this.country = country;
			this.state = state;
			this.city = city;
			this.neighborhood = neighborhood;
			this.street = street;
			this.number = number;
		}
		
		// MARK: - Public
		
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		
		public String getZipCode() {
			return this.zipCode;
		}
}
