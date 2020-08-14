package data;

import com.google.gson.Gson;
import org.bson.Document;

import model.Seller;

public class SellerDAO {
	
	MongoDBManager dbManager = new MongoDBManager();
	Gson gson = new Gson();

	// MARK: - Public
	public boolean saveSeller(Seller seller) {
		String jsonObject = gson.toJson(seller);
		Document document = Document.parse(jsonObject);
		return dbManager.saveDocument(document);
	}
	
}
