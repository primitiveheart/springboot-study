package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class SpringbootVueSpringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVueSpringsecurityApplication.class, args);
	}
}
