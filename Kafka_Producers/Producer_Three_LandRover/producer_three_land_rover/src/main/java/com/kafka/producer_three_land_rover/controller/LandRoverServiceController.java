package com.kafka.producer_three_land_rover.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.producer_three_land_rover.model.LandRoverCars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "landRoverKafka")
public class LandRoverServiceController {

    private static final Logger logger = LoggerFactory.getLogger(LandRoverServiceController.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    private static final String LAND_ROVER_ON_ROADER = "LAND_ROVER_ON_ROADER";
    private static final String LAND_ROVER_OFF_ROADER = "LAND_ROVER_OFF_ROADER";

    @GetMapping("/publish/landRoverOnRoader")
    public ResponseEntity<String> publishLandRoverOnRoaderCars() {
        try {
            logger.info("---------> Publishing Land Rover On Roader Car From Producer three <---------");
            this.kafkaTemplate.send(LAND_ROVER_ON_ROADER, this.objectMapper.writeValueAsString(
                    LandRoverCars.builder().model("Land Rover").series("On Roader").cost(15000L)
                            .build()));
        } catch (JsonProcessingException e) {
            return ResponseEntity.badRequest().body("This is a bad request bro !!!");
        }

        return ResponseEntity.ok("Land Rover On Roader Published Successfully");
    }

    @GetMapping("/publish/landRoverOffRoader")
    public ResponseEntity<String> publishLandRoverOffRoaderCars() {
        try {
            logger.info("---------> Publishing Land Rover Off Roader Car From Producer three <---------");
            this.kafkaTemplate.send(LAND_ROVER_OFF_ROADER, this.objectMapper.writeValueAsString(
                    LandRoverCars.builder().model("Land Rover").series("Off Roader").cost(8000L)
                            .build()));
        } catch (JsonProcessingException e) {
            return ResponseEntity.badRequest().body("This is a bad request bro !!!");
        }

        return ResponseEntity.ok("Land Rover Off Roader Published Successfully");
    }
}
