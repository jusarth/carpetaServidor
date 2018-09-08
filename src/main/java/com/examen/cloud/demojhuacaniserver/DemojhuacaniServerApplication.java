package com.examen.cloud.demojhuacaniserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemojhuacaniServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojhuacaniServerApplication.class, args);
	}
}
