package com.example.demo.kafka.serdes;

import java.util.Map;

import com.example.demo.kafka.model.URValue;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

public class ValueKafkaDeserializer implements Deserializer {

    @Override
    public void configure (final Map configs, final boolean isKey) {

    }

    @Override
    public URValue deserialize (final String topic, final byte[] data) {
        ObjectMapper mapper = new ObjectMapper();
        URValue urValue= null;
        try {
            urValue = mapper.readValue(data, URValue.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return urValue;
    }
}
