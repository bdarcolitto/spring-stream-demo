package com.example.demo.kafka;

import static com.example.demo.config.StreamChannelsConfig.INPUT_CITY_DATA;

import com.example.demo.kafka.model.URKey;
import com.example.demo.kafka.model.URValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CityKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityKafkaConsumer.class);

//    @StreamListener(INPUT)
    @StreamListener(value = INPUT_CITY_DATA)
    public void consumeEmployeeDetails(@Payload URValue urValue,
                                       @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) URKey messageKey,
                                       @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition
    ) {
        LOGGER.info("Partition ({}) - Key[[{}]] ---- {}"
                , partition, messageKey, urValue);
    }
}
