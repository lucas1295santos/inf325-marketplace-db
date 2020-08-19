package data;

import com.mongodb.client.MongoClients;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import org.bson.Document;
import static com.mongodb.client.model.Filters.*;

import java.util.ArrayList;
import java.util.List;

public class MongoDBManager {
	MongoDatabase db;
	String dbName = "marketplace";
	String collectionName = "sellers";
	
	public MongoDBManager() {
		openConnectionToDB();
	}
	
	// Public
	
	public Document getObjectFromID(String id) {
		return findDocumentsById(id).first();
	}
	
	public boolean saveDocument(Document document) {
		return insertDocument(document);
	}
	
	
	
	// MARK: - Query
	
	FindIterable<Document> findDocumentsById(String id) {
		MongoCollection<Document> collection = db.getCollection(collectionName);
		
		return collection.find(eq("_id", id));
	}
	
	List<Document> findAll() {
		MongoCollection<Document> collection = db.getCollection(collectionName);
		MongoCursor<Document> cursor = collection.find().iterator();
		ArrayList<Document> allDocs = new ArrayList<Document>();
		
		while(cursor.hasNext()) {
			Document doc = cursor.next();
			allDocs.add(doc);
		}
		
		return allDocs;
	}
	
	// MARK: - Insert
	
	private boolean insertDocument(Document document) {
		MongoCollection<Document> collection = db.getCollection(collectionName);
		return collection.insertOne(document).getInsertedId().isNull() == false;
	}
	
	// MARK: - DB setup
	
	void openConnectionToDB() {
		MongoClient mongoClient = MongoClients.create();
		db = mongoClient.getDatabase(dbName);
	}
}
