package com.kafka.consumer_two_car_showroom.kafkaListeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerMercedes {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerMercedes.class);

    private static final String MERCEDES_A_SERIES = "MERCEDES_A_SERIES";

    private static final String MERCEDES_E_SERIES = "MERCEDES_E_SERIES";

    @KafkaListener(topics = MERCEDES_A_SERIES)
    public void consumeMercedesASeries(String car) {
        logger.info("---------> Receiving Mercedes A Series Car In Consumer Two <---------");
        logger.info("---------> Receiving Mercedes A Series Car From Producer Two <---------");
        logger.info("Received Car : " + car);
    }

    @KafkaListener(topics = MERCEDES_E_SERIES)
    public void consumeMercedesESeries(String car) {
        logger.info("---------> Receiving Mercedes E Series Car In Consumer Two <---------");
        logger.info("---------> Receiving Mercedes E Series Car From Producer Two <---------");
        logger.info("Received Car : " + car);
    }
}
