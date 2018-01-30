package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.springboot")
@MapperScan(basePackages = "com.example.springboot.dao")
public class SpringbootFreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFreemarkerApplication.class, args);
	}
}
