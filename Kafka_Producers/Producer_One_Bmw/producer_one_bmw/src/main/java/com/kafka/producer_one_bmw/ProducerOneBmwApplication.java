package com.kafka.producer_one_bmw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerOneBmwApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(ProducerOneBmwApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProducerOneBmwApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("--------------> Producer One <----------------");
		logger.info("----      Producer One for BMW Cars       ----");
		logger.info("----              STARTED                 ----");
		logger.info("----------------------------------------------");
	}
}
