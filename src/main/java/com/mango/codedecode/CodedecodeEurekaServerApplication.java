package com.mango.codedecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CodedecodeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodedecodeEurekaServerApplication.class, args);
	}

}
