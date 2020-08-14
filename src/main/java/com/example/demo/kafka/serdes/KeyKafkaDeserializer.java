package com.example.demo.kafka.serdes;

import java.util.Map;

import com.example.demo.kafka.model.URKey;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

public class KeyKafkaDeserializer implements Deserializer {

    @Override
    public void configure (final Map configs, final boolean isKey) {

    }

    @Override
    public URKey deserialize (final String topic, final byte[] data) {
        ObjectMapper mapper = new ObjectMapper();
        URKey urKey = null;
        try {
            urKey = mapper.readValue(data, URKey.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return urKey;
    }
}
