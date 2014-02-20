package mongo;

import junit.framework.TestCase;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class MongoTest extends TestCase {
	
	private Mongo mongo;
	private DB db;
	private DBCollection dbco;
	private DBCursor cursor;

	@Override
	protected void setUp() throws Exception {
		mongo = new Mongo("127.0.0.1", 8888);
		db = mongo.getDB("test");
		dbco = db.getCollection("test");
		cursor = dbco.find();
	}
	
	public void testCursor(){
		while(cursor.hasNext()){
			System.out.println(cursor.next().toMap());
		}
	}

	@Override
	protected void tearDown() throws Exception {
		mongo.close();
	}
	
}
