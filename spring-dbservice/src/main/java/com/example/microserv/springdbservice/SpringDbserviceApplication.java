package com.example.microserv.springdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringDbserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDbserviceApplication.class, args);
	}

}
