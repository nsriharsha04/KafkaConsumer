# Kafka Consumer

This is a Spring Boot application that consumes flight data messages from a Kafka topic and stores them in a MongoDB database.

## Technologies Used

*   Java 17
*   Spring Boot 3.0.5
*   Spring Kafka
*   Spring Data MongoDB
*   Lombok
*   Maven

## Configuration

1.  **Kafka:**
    *   The Kafka broker is expected to be running on `localhost:9092`.
    *   The consumer group ID is `my-group`.
    *   The application listens to the `flight-topic` topic.
    *   These values can be configured in `src/main/java/com/umbc/consumer/config/ConsumerConfigKafka.java`.

2.  **MongoDB:**
    *   The MongoDB instance is expected to be running on `localhost:27017`.
    *   The application uses the `flightdb` database and the `flightdata` collection.
    *   These values can be configured in `src/main/java/com/umbc/consumer/config/MongoConfig.java`.

## How to Run

1.  **Prerequisites:**
    *   Java 17
    *   Maven
    *   Kafka
    *   MongoDB

2.  **Clone the repository:**
    ```bash
    git clone https://github.com/SreeNemalikonda/KafkaConsumer.git
    ```

3.  **Start Kafka and MongoDB:**
    *   Ensure your Kafka and MongoDB instances are running.

4.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```