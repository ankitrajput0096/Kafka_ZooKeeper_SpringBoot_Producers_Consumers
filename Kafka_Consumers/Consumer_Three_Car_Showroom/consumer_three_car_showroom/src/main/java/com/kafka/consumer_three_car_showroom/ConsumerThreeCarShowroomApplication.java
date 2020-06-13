package com.kafka.consumer_three_car_showroom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerThreeCarShowroomApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(ConsumerThreeCarShowroomApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumerThreeCarShowroomApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("--------------> Consumer Three <----------------");
		logger.info("----    Consumer Three for Car Showroom     ----");
		logger.info("----              STARTED                 ----");
		logger.info("----------------------------------------------");
	}
}
