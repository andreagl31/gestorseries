package com.example.gestorseries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.gestorseries")
public class GestorseriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorseriesApplication.class, args);
	}

}
