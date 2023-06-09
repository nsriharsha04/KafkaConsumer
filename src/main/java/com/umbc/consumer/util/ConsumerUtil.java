package com.umbc.consumer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.umbc.consumer.model.Flight;

public class ConsumerUtil {

    public static String parseMessage(String message) {
        String parsedString = null;
        ObjectMapper om = new ObjectMapper();
        try {
            Flight flight = om.readValue(message.replaceAll("NaN", "null"), Flight.class);
            parsedString = om.writeValueAsString(flight);
        } catch (JsonProcessingException e) {
            System.out.println("Error while processing JSON: " + e.getMessage());
        }
        return parsedString;
    }
}
