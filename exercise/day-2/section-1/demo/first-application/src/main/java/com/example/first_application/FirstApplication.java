package com.example.first_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		}

	@GetMapping
	public String sayHello(){
		return "Hello World";
	}

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("Karta", "Kevin", "Bram");
	}
}
