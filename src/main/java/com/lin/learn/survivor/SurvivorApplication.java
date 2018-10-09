package com.lin.learn.survivor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.learn.survivor.mapper")
public class SurvivorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurvivorApplication.class, args);
	}
}
