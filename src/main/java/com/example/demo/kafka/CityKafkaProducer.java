package com.example.demo.kafka;

import com.example.demo.kafka.model.CityKafkaModel;
import com.example.demo.resource.KafkaInterationResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class CityKafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityKafkaProducer.class);

    @Autowired
    private Processor processor;

    public void producerCity(int id, String name) {

        // creating employee details
        CityKafkaModel city = new CityKafkaModel();
        city.setName(name);
        city.setId(id);

        Message<CityKafkaModel> message = MessageBuilder
                .withPayload(city)
                .setHeader(KafkaHeaders.MESSAGE_KEY, String.valueOf(city.getId()))
                .build();

        LOGGER.info("Sending message id = {} and name = {}", id, name);

        processor.output()
                .send(message);
    }
}
