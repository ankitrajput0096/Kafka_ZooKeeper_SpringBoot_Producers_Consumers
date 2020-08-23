package com.kafka.producer_one_bmw.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.producer_one_bmw.model.BmwCars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "bmwKafka")
public class BmwServiceController {

    private static final Logger logger =
            LoggerFactory.getLogger(BmwServiceController.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    private static final String BMW_SEVEN_SERIES = "BMW_SEVEN_SERIES";
    private static final String BMW_FIVE_SERIES = "BMW_FIVE_SERIES";

    @GetMapping("/publish/bmwSevenSeries")
    public ResponseEntity<String> publishBmwSevenSeriesCars() {
        try {
            logger.info("---------> Publishing BMW Seven Series Car From Producer one <---------");
            this.kafkaTemplate.send(BMW_SEVEN_SERIES, this.objectMapper.writeValueAsString(
                    BmwCars.builder().model("BMW").series("Seven").cost(5000L).build()));
        } catch (JsonProcessingException e) {
            return ResponseEntity.badRequest().body("This is a bad request bro !!!");
        }

        return ResponseEntity.ok("BMW Seven Series Published Successfully");
    }

    @GetMapping("/publish/bmwFiveSeries")
    public ResponseEntity<String> publishBmwFiveSeriesCars() {
        try {
            logger.info("---------> Publishing BMW Five Series Car From Producer one <---------");
            this.kafkaTemplate.send(BMW_FIVE_SERIES, this.objectMapper.writeValueAsString(
                    BmwCars.builder().model("BMW").series("Five").cost(3000L).build()));
        } catch (JsonProcessingException e) {
            return ResponseEntity.badRequest().body("This is a bad request bro !!!");
        }

        return ResponseEntity.ok("BMW Five Series Published Successfully");
    }
}
