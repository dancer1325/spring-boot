package com.example.first;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstApplication {

	private static final Log logger = LogFactory.getLog(FirstApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		logger.info("home() has been called");
		return "Hello World!";
	}

}
