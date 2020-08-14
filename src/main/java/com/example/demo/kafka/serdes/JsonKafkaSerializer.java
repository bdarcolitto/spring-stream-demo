package com.example.demo.kafka.serdes;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

public class JsonKafkaSerializer implements Serializer {

    @Override
    public void configure (final Map configs, final boolean isKey) {

    }

    @Override
    public byte[] serialize (final String topic, final Object data) {
        byte[] retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            retVal = objectMapper.writeValueAsString(data).getBytes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }
}