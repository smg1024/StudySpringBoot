package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ShopadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopadminApplication.class, args);
	}

}
