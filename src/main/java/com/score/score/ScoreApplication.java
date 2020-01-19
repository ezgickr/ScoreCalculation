package com.score.score;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

@SpringBootApplication
public class ScoreApplication{

	private static final Logger log = LoggerFactory.getLogger(ScoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ScoreApplication.class, args);
	}

}
