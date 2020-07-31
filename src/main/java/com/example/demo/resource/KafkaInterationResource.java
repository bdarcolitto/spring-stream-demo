package com.example.demo.resource;


import com.example.demo.kafka.CityKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/kafka")
public class KafkaInterationResource {

    @Autowired
    CityKafkaProducer cityKafkaProducer;

    @PostMapping(value = "/register", consumes = MediaType.TEXT_PLAIN_VALUE) // http://localhost:8080/kafka/register
    public ResponseEntity<String> findAll(@RequestBody String cityName) {
        cityKafkaProducer.producerCity(new Random().nextInt(999999999) + 1,cityName);
        return ResponseEntity.ok("OK");
    }
}
