package com.kafka.consumer_three_car_showroom.kafkaListeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerLandRover {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerLandRover.class);

    private static final String LAND_ROVER_ON_ROADER = "LAND_ROVER_ON_ROADER";

    private static final String LAND_ROVER_OFF_ROADER = "LAND_ROVER_OFF_ROADER";

    @KafkaListener(topics = LAND_ROVER_ON_ROADER)
    public void consumeLandRoverOnRoader(String car) {
        logger.info("---------> Receiving Land Rover On Roader Car In Consumer Three <---------");
        logger.info("---------> Receiving Land Rover On Roader Car From Producer Three <---------");
        logger.info("Received Car : " + car);
    }

    @KafkaListener(topics = LAND_ROVER_OFF_ROADER)
    public void consumeLandRoverOffRoader(String car) {
        logger.info("---------> Receiving Land Rover Off Roader Car In Consumer Three <---------");
        logger.info("---------> Receiving Land Rover Off Roader Car From Producer Three <---------");
        logger.info("Received Car : " + car);
    }
}
