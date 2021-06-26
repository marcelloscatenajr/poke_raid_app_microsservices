package com.scatena.marcello.RaidManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RaidManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaidManagerApplication.class, args);
	}

}
