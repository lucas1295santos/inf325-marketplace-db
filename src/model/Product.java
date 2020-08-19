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
			this.set_id(_id);
			this.setName(name);
			this.setDescription(description);
			this.setPriceInCents(priceInCents);
		}
		
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

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getPriceInCents() {
			return priceInCents;
		}

		public void setPriceInCents(int priceInCents) {
			this.priceInCents = priceInCents;
		}
}
