package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Builder
@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		}

	@GetMapping
	public GetAssetResponse sayHello(){
		var response = GetAssetResponse.builder().id(1L).name("Asset1").build();

		response.setName("AMAN");

		response.getName();

		return response;
	}

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("Karta", "Kevin", "Bram");
	}

//	@GetMapping("/users/{id}")
//	public ResponseEntityLong
}
