package com.scatena.marcello.Raid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RaidApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaidApplication.class, args);
	}

}
