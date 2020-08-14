package com.example.demo.kafka;

import com.example.demo.kafka.model.URKey;
import com.example.demo.kafka.model.URValue;
import com.example.demo.model.ValuesModel;
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



    public void producerCity(ValuesModel vm) {

        URValue urValue = new URValue(vm.getValue1(), vm.getValue2(), vm.getValue3());


        Message<URValue> message = MessageBuilder
                .withPayload(urValue)
                .setHeader(KafkaHeaders.MESSAGE_KEY, new URKey(vm.getUr_id(), vm.getCustomer_id()))
                .build();

//        LOGGER.info("Sending message id = {} and name = {}", id, name);

        processor.output()
                .send(message);
    }
}
