package com.example.first_application;

import com.example.first_application.request.CreateAssetRequest;
import com.example.first_application.request.UpdateAssetRequest;
import com.example.first_application.response.CreateAssetResponse;
import com.example.first_application.response.GetAssetResponse;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Builder
@RestController
@SpringBootApplication
public class FirstApplication {

	//buat list untuk menampung data
	private List<CreateAssetResponse> assets = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping
	public ArrayList<GetAssetResponse> getAssets() {
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		GetAssetResponse asset1 = GetAssetResponse.builder().id(1L).name("John Doe 1").type("Laki laki").build();
		GetAssetResponse asset2 = GetAssetResponse.builder().id(1L).name("John Doe 1").type("Laki laki").build();
		list.add(asset1);
		list.add(asset2);
		return list;
	}

	@GetMapping("/users")
	public List<String> getUser() {
		return List.of("Karta", "Kevin", "Bram");
	}

//	@GetMapping("/assets/{id}")
//	public GetAssetResponse getAssetbyId(
//			@PathVariable Long id
//
//	)

	// Print yang diatas id
//	@GetMapping("/assets/{id}")
//	public ArrayList<GetAssetResponse> getAssetbyId(
//			@PathVariable Long id
//	)
//	{
//		ArrayList<GetAssetResponse> list = new ArrayList<>();
//		List<GetAssetResponse> asset = new ArrayList<>();
//		asset.add(GetAssetResponse.builder().id(1L).name("John Doe 1").type("Laki laki").build());
//		asset.add(GetAssetResponse.builder().id(2L).name("John Doe 2").type("Laki laki").build());
//		asset.add(GetAssetResponse.builder().id(3L).name("John Doe 3").type("Laki laki").build());
//		asset.add(GetAssetResponse.builder().id(4L).name("John Doe 4").type("Laki laki").build());
//		asset.add(GetAssetResponse.builder().id(5L).name("John Doe 5").type("Laki laki").build());
////		for (int i = 0; i < asset.size(); i++){
////			if (asset.get(i).getId().equals(id)){
////				return asset.get(i);
////			}
////		}
//		for (GetAssetResponse getAssetResponse : asset){
//			if (getAssetResponse.getId() >= id ) {
//				list.add(getAssetResponse);
//			}
//		}
//		return list;
//	}

//	@GetMapping("/calculator/add")
//	public String getAdd(
//			@RequestParam(name = "panjang") int panjang,
//			@RequestParam(name = "lebar", required = false) int lebar
//	){
//		return String.valueOf(panjang + lebar);
//	}

//	public GetAssetResponse getAssetbyId(
//			PathVariable Long id
//	){
//		return GetAssetResponse.builder().id(1L);
//	}
//	)

//	@GetMapping("/users/{id}")
//	public ResponseEntityLong

	@GetMapping("/assets/add")
	public List<GetAssetResponse> getAssetbyId(
//			@PathVariable Long id,
			@RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "size", defaultValue = "1") int size
//			@RequestParam(name = "lebar", required = false) int lebar
	) {
		List<GetAssetResponse> asset = new ArrayList<>();
		asset.add(GetAssetResponse.builder().id(1L).name("John Doe 1").type("Laki laki").build());
		asset.add(GetAssetResponse.builder().id(2L).name("John Doe 2").type("Laki laki").build());
		asset.add(GetAssetResponse.builder().id(3L).name("John Doe 3").type("Laki laki").build());
		asset.add(GetAssetResponse.builder().id(4L).name("John Doe 4").type("Laki laki").build());
		asset.add(GetAssetResponse.builder().id(5L).name("John Doe 5").type("Laki laki").build());

		int i = ((page - 1) * size);
		int start = i;
		List<GetAssetResponse> tampung = new ArrayList<>();

		while (i < (start + size) && i < asset.size()) {
			tampung.add(asset.get(i));
			i++;
		}
		return tampung;

//		for (GetAssetResponse getAssetResponse : asset){
////			if (getAssetResponse.getId() >= id ) {
////				list.add(getAssetResponse);
////			}
//		}
	}

//	@PostMapping("/assets")
//	public ResponseEntity<List<CreateAssetResponse>> createAsset(
//			@RequestBody CreateAssetResponse request) {
//
//		//init data
//		List<CreateAssetResponse> asset = new ArrayList<>();
//
//		// mock data
//		asset.add(CreateAssetResponse.builder().id(1L).name("AB").type("type1").build());
//		asset.add(CreateAssetResponse.builder().id(2L).name("CD").type("type2").build());
//
//		//add new user
//		asset.add(
//				CreateAssetResponse.builder().id(request.getId()).name(request.getName()).type(request.getType()).build()
//		);
//
//		//return response
//		return new ResponseEntity<>(asset, HttpStatus.OK);
//	}

	// url/employee
	// create employee
	// id (generate by system)
	// name
	// age
	// address (nullable)
	// phone

//	@PostMapping("/employee")
//	public ResponseEntity<List<CreateAssetResponse>> createAsset(
//			@RequestBody CreateAssetResponse request) {
//
//		//init data
//		List<CreateAssetResponse> asset = new ArrayList<>();
//
//		// mock data
//		asset.add(CreateAssetResponse.builder().id(1L).name("AB").type("type1").address("bintaro").phone(123456L).build());
//		asset.add(CreateAssetResponse.builder().id(2L).name("CD").type("type2").address("bintaro").phone(456789L).build());
//		asset.add(CreateAssetResponse.builder().id(3L).name("CD").type("type2").address("bintaro").phone(456789L).build());
//
//		//buat id untuk generate
//		int end = asset.size() - 1;
//
//		//add new asset
//		if (request.getName() != null && request.getType() != null && request.getPhone() != null) {
//			asset.add(
//					CreateAssetResponse.builder().id(asset.get(end).getId() + 1).name(request.getName()).type(request.getType()).address(request.getAddress()).phone(request.getPhone()).build()
//			);
//		}
//
//		//return response
//		return new ResponseEntity<>(asset, HttpStatus.OK);
//	}


	@PostMapping("/assets")
	public ResponseEntity<List<CreateAssetResponse>> createAsset(
			@RequestBody CreateAssetRequest request) {

		assets.add(CreateAssetResponse.builder().id((long) assets.size()+1).name(request.getName()).build());

		//return response
		return new ResponseEntity<>(assets, HttpStatus.OK);
	}

	@PatchMapping("/assets/{id}")
	public ResponseEntity<List<CreateAssetResponse>> updateAsset(
			@RequestBody UpdateAssetRequest request,
			@PathVariable("id") Long id) {

		//check
		for (CreateAssetResponse asset : assets) {
			if (asset.getId()==id) {
				asset.setName(request.getName());
			}
		}

		//return response
		return new ResponseEntity<>(assets, HttpStatus.OK);
	}
}
