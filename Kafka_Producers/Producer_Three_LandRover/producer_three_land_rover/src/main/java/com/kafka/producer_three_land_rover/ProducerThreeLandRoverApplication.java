package com.kafka.producer_three_land_rover;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerThreeLandRoverApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(ProducerThreeLandRoverApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProducerThreeLandRoverApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("--------------> Producer Three <----------------");
		logger.info("----    Producer Three for Land Rover Cars  ----");
		logger.info("----              STARTED                   ----");
		logger.info("------------------------------------------------");
	}

}
