package com.kafka.consumer_two_car_showroom.kafkaListeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerBMW {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerBMW.class);

    private static final String BMW_SEVEN_SERIES = "BMW_SEVEN_SERIES";

    private static final String BMW_FIVE_SERIES = "BMW_FIVE_SERIES";

    @KafkaListener(topics = BMW_SEVEN_SERIES)
    public void consumeBmwSevenSeries(String car) {
        logger.info("---------> Receiving BMW Seven Series Car In Consumer Two <---------");
        logger.info("---------> Receiving BMW Seven Series Car From Producer One <---------");
        logger.info("Received Car : " + car);
    }

    @KafkaListener(topics = BMW_FIVE_SERIES)
    public void consumeBmwFiveSeries(String car) {
        logger.info("---------> Receiving BMW Five Series Car In Consumer Two <---------");
        logger.info("---------> Receiving BMW Five Series Car From Producer One <---------");
        logger.info("Received Car : " + car);
    }
}
