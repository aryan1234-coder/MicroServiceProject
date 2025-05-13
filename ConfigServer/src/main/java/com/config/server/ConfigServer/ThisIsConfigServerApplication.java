package com.config.server.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class ThisIsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThisIsConfigServerApplication.class, args);
	}

}
