package com.example.springboot3_security;

import org.springframework.boot.SpringApplication;

public class TestSpringboot3SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.from(Springboot3SecurityApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
