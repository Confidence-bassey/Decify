package com.alphainnovator.decify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.alphainnovator.decify")
public class DecifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecifyApplication.class, args);
	}

}
