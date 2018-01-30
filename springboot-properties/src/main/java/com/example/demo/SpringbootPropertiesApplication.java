package com.example.demo;

import com.example.demo.property.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPropertiesApplication implements CommandLineRunner{

	@Autowired
	private HomeProperties homeProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPropertiesApplication.class, args);
	}

	public void run(String... strings) throws Exception {
		System.out.println("\n" + homeProperties.toString());
	}
}
