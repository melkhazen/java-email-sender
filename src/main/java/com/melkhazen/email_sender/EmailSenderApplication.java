package com.melkhazen.email_sender;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class EmailSenderApplication {
	private static final Logger log = LoggerFactory.getLogger(EmailSenderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);

	}
}
