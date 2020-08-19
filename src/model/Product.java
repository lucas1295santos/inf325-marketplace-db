package model;

import org.bson.types.ObjectId;

public class Product {
	// MARK: - Private
		private ObjectId _id;
		private String name;
		private String description;
		private int priceInCents;
		
		// MARK: - Init
		
		public Product(
				ObjectId _id,
				String name,
				String description,
				int priceInCents
				) {
			this._id = _id;
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
