package com.kafka.producer_two_mercedes.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.producer_two_mercedes.model.MercedesCars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "mercedesKafka")
public class MercedesServiceController {

    private static final Logger logger = LoggerFactory.getLogger(MercedesServiceController.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    private static final String MERCEDES_A_SERIES = "MERCEDES_A_SERIES";
    private static final String MERCEDES_E_SERIES = "MERCEDES_E_SERIES";

    @GetMapping("/publish/mercedesASeries")
    public ResponseEntity<String> publishMercedesASeriesCars() {
        try {
            logger.info("---------> Publishing Mercedes A Series Car From Producer two <---------");
            this.kafkaTemplate.send(MERCEDES_A_SERIES, this.objectMapper.writeValueAsString(
                    MercedesCars.builder().model("Mercedes").series("A").cost(10000L)
                            .build()));
        } catch (JsonProcessingException e) {
            return ResponseEntity.badRequest().body("This is a bad request bro !!!");
        }

        return ResponseEntity.ok("Mercedes A Series Published Successfully");
    }

    @GetMapping("/publish/mercedesESeries")
    public ResponseEntity<String> publishMercedesESeriesCars() {
        try {
            logger.info("---------> Publishing Mercedes E Series Car From Producer two <---------");
            this.kafkaTemplate.send(MERCEDES_E_SERIES, this.objectMapper.writeValueAsString(
                    MercedesCars.builder().model("Mercedes").series("E").cost(7000L)
                            .build()));
        } catch (JsonProcessingException e) {
            return ResponseEntity.badRequest().body("This is a bad request bro !!!");
        }

        return ResponseEntity.ok("Mercedes E Series Published Successfully");
    }
}
