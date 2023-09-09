package espe.edu.ec.controller;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoDBConnection {
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    private static final String CONNECTION_STRING = "mongodb+srv://" + USERNAME + ":" + PASSWORD +
        "@university.xy2dwnf.mongodb.net/?retryWrites=true&w=majority";

    private static MongoClient mongoClient;

    private MongoDBConnection() {
    }

    public static synchronized MongoClient getMongoClient() {
        if (mongoClient == null) {
            // Configuración del cliente MongoDB
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(new ConnectionString(CONNECTION_STRING))
                    .build();

            // Crear el cliente MongoDB
            mongoClient = MongoClients.create(settings);
        }
        return mongoClient;
    }
    
    public static synchronized void closeMongoClient() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
        }
    }
    
    
    
}