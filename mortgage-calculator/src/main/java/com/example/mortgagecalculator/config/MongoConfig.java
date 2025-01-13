package com.example.mortgagecalculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class MongoConfig {

    // Load environment variables from the .env file
    private final Dotenv dotenv = Dotenv.configure().load();

    /**
     * Creates a MongoDatabaseFactory using the MongoDB URI from the .env file.
     * Ensures the URI is present and valid.
     *
     * @return a MongoDatabaseFactory instance
     */
    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory() {
        String mongoUri = dotenv.get("MONGO_URI");
        if (mongoUri == null || mongoUri.trim().isEmpty()) {
            throw new IllegalStateException("MONGO_URI is not set or is empty in the environment variables");
        }
        return new SimpleMongoClientDatabaseFactory(mongoUri);
    }

    /**
     * Creates a MongoTemplate for interacting with MongoDB.
     *
     * @return a MongoTemplate instance
     */
    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDatabaseFactory());
    }

    /**
     * Creates a transaction manager for MongoDB, enabling transactional operations.
     *
     * @param dbFactory the MongoDatabaseFactory
     * @return a MongoTransactionManager instance
     */
    @Bean
    public MongoTransactionManager transactionManager(MongoDatabaseFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }
}
