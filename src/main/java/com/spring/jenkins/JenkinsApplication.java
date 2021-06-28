package com.spring.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsApplication {

	public static final Logger log = LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void init(){
		log.info("Application started...");
	}

	public static void main(String[] args) {
		log.info("Starting applicacion...");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
