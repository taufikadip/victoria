package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Builder
@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		}

	@GetMapping
	public ArrayList<GetAssetResponse> getAssets(){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		GetAssetResponse asset1 = new GetAssetResponse(1L,"Karta","type1");
		GetAssetResponse asset2 = new GetAssetResponse(2L,"Kevin","type2");
		list.add(asset1);
		list.add(asset2);
		return list;
	}

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("Karta", "Kevin", "Bram");
	}

//	@GetMapping("/users/{id}")
//	public ResponseEntityLong
}
