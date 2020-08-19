package data;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Seller> getSellers() {
		List<Document> documents = dbManager.findAll();
		ArrayList<Seller> sellers = new ArrayList<Seller>();
		documents.forEach(doc -> {
			Seller seller = gson.fromJson(doc.toJson(), Seller.class);
			sellers.add(seller);
		});
		return sellers;
	}
	
}
