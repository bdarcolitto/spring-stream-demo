package com.example.demo.resource;

import com.example.demo.kafka.CityKafkaProducer;
import com.example.demo.model.ValuesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaInterationResource {

    @Autowired
    CityKafkaProducer cityKafkaProducer;

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE) // http://localhost:8080/kafka/register
    public ResponseEntity<String> findAll(@RequestBody ValuesModel values) {
        cityKafkaProducer.producerCity(values);
        return ResponseEntity.ok("OK");
    }
}
