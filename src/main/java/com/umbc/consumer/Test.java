package com.umbc.consumer;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

public class Test {
    public static void main(String[] args) {
        // Replace the uri string with your MongoDB deployment's connection string
//        String uri = "<connection string uri>";
        try (MongoClient mongoClient = MongoClients.create()) {
            MongoDatabase database = mongoClient.getDatabase("testdb");
            MongoCollection<Document> collection = database.getCollection("person2");
            try {
                String in = "{\"fname\": \"A\", \"lname\": \"P\", \"age\": 12, \"sex\": \"M\"}";
                Document doc = Document.parse(in);
                InsertOneResult result = collection.insertOne(doc);
                System.out.println("Success! Inserted document id: " + result.getInsertedId());
            } catch (MongoException me) {
                System.err.println("Unable to insert due to an error: " + me);
            }
        }
    }
}
