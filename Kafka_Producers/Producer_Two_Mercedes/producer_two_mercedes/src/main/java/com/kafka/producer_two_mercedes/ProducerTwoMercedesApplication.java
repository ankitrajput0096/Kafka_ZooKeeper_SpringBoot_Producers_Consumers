package com.kafka.producer_two_mercedes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerTwoMercedesApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(ProducerTwoMercedesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProducerTwoMercedesApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("--------------> Producer Two <----------------");
		logger.info("----    Producer Two for Mercedes Cars    ----");
		logger.info("----              STARTED                 ----");
		logger.info("----------------------------------------------");
	}

}
