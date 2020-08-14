package model;

public class Product {
	// MARK: - Private
		private String id;
		private String name;
		private String description;
		private int priceInCents;
		
		// MARK: - Init
		
		public Product(
				String id,
				String name,
				String description,
				int priceInCents
				) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.priceInCents = priceInCents;
		}
		
		// MARK: - Public
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
}
