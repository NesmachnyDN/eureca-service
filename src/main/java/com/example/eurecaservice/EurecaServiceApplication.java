package com.example.eurecaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurecaServer
@SpringBootApplication
public class EurecaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurecaServiceApplication.class, args);
	}
}
