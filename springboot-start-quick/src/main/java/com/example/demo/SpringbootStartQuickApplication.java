package com.example.demo;

import com.example.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.controller")
public class SpringbootStartQuickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStartQuickApplication.class, args);
	}
}
