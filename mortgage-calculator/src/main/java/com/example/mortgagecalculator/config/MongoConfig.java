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

    // Use dotenv-java to load environment variables
    private final Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory() {
        String mongoUri = dotenv.get("MONGO_URI");
        if (mongoUri == null || mongoUri.isEmpty()) {
            throw new IllegalStateException("MONGO_URI is not set in the environment variables");
        }
        return new SimpleMongoClientDatabaseFactory(mongoUri);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDatabaseFactory());
    }

    @Bean
    public MongoTransactionManager transactionManager(MongoDatabaseFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }
}
