package com.umbc.consumer.config;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import com.umbc.consumer.util.ConsumerUtil;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.Objects;


@Configuration
public class MongoConfig {

    @Autowired
    private MongoClient mongoClient;

    private MongoCollection<Document> collection;

    @PostConstruct
    public void init() {
        mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase("flightdb");
        collection = database.getCollection("flightdata");
    }


    public void insertToDB(String message) {
        try {
            if (!StringUtils.isEmpty(message)) {
                Document document = Document.parse(ConsumerUtil.parseMessage(message));
                System.out.println(document);
                if (Objects.nonNull(document)) {
                    InsertOneResult result = collection.insertOne(document);
                    System.out.println("Success! Inserted document id: " + result.getInsertedId());
                }
            }
        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }


//    public static void main(String[] args) {
//        String msg  = "{\"FL_DATE\": \"1/1/09\", \"OP_CARRIER\": \"XE\", \"OP_CARRIER_FL_NUM\": 2008, \"ORIGIN\": \"GSO\", \"DEST\": \"IAH\", \"CRS_DEP_TIME\": 625, \"DEP_TIME\": 624, \"DEP_DELAY\": -1, \"TAXI_OUT\": 18, \"WHEELS_OFF\": 642, \"WHEELS_ON\": 815, \"TAXI_IN\": 5, \"CRS_ARR_TIME\": 834, \"ARR_TIME\": 820, \"ARR_DELAY\": -14, \"CANCELLED\": 0, \"CANCELLATION_CODE\": NaN, \"DIVERTED\": 0, \"CRS_ELAPSED_TIME\": 189, \"ACTUAL_ELAPSED_TIME\": 176, \"AIR_TIME\": 153, \"DISTANCE\": 986, \"CARRIER_DELAY\": NaN, \"WEATHER_DELAY\": NaN, \"NAS_DELAY\": NaN, \"SECURITY_DELAY\": NaN, \"LATE_AIRCRAFT_DELAY\": NaN, \"Unnamed: 27\": NaN}";
//        System.out.println(ConsumerUtil.parseMessage(msg));
//    }

}
