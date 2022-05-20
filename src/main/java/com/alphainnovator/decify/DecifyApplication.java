package com.alphainnovator.decify;

import core.ApiConnection;
import core.Payments;
import lombok.var;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.alphainnovator.decify")
public class DecifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecifyApplication.class, args);

		Payments payments = new Payments();

		var response =payments.pay("748rbri4823ruoqedb9h435", "2000", "daniel.oyagha@gmail.com","Daniel Oyagha", "CARD",
				"08060335875", "NGN",
				"https://www.Google.com", "Goods");
		System.out.println(response);
		ApiConnection.shutDown();
	}

}
