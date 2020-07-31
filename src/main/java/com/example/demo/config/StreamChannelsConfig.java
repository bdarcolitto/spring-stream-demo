package com.example.demo.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Exemplo de canal de entrada custom
 */
public interface StreamChannelsConfig {

    String INPUT_CITY_DATA = "input-city-data";

    @Input(INPUT_CITY_DATA)
    SubscribableChannel inputCityData();

}
