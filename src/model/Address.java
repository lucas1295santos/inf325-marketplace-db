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
			this.setZipCode(zipCode);
			this.setCountry(country);
			this.setState(state);
			this.setCity(city);
			this.setNeighborhood(neighborhood);
			this.setStreet(street);
			this.setNumber(number);
		}
		
		// MARK: - Public
		
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		
		public String getZipCode() {
			return this.zipCode;
		}
		
		public void setCountry(String country) {
			this.country = country;
		}
		
		public String getCountry() {
			return this.country;
		}
		
		public void setState(String state) {
			this.state = state;
		}
		
		public String getState() {
			return this.state;
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		
		public String getCity() {
			return this.city;
		}
		
		public void setNeighborhood(String neighborhood) {
			this.neighborhood = neighborhood;
		}
		
		public String getNeighborhood() {
			return this.neighborhood;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}
}
