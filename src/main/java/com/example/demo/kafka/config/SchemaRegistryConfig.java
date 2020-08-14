package com.example.demo.kafka.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SchemaRegistryConfig {

//    @Bean
//    public SchemaRegistryClient schemaRegistryClient(@Value("${spring.cloud.stream.kafka.binder.producer-properties.schema.registry.url}") String endPoint) {
//        ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
//        client.setEndpoint(endPoint);
//        return client;
//    }
}
