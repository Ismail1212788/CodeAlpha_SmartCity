package com.example.SmartCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SmartCityApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
                .sources(SmartCityApplication.class)
                .run();
	}

}
