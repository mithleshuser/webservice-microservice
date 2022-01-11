package com.rahul.mydiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDiscoveryServerApplication.class, args);
 System.out.print("hekko");	}

}
