package com.appdeveloperblog.EurekaDiscoveryService1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscoveryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryService1Application.class, args);
	}

}
