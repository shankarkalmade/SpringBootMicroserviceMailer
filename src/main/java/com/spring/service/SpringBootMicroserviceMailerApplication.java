package com.spring.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.spring.service.services"})
public class SpringBootMicroserviceMailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceMailerApplication.class, args);
	}
}
