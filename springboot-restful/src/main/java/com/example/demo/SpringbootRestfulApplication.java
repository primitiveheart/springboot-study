package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//springboot 应用标识
@SpringBootApplication
@ComponentScan(basePackages = "com.example")
//mapper 接口类扫描包配置
@MapperScan(basePackages = "com.example.dao")
public class SpringbootRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulApplication.class, args);
	}
}
