package com.example.hotel.HotelServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServicesApplication.class, args);
	}

}
