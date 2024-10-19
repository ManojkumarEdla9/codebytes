package com.example.demo.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example.demo")
public class SpringBootWebTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebTaskApplication.class, args);
	}

}
