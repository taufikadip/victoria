package com.example.my_everything;

import com.example.my_everything.request.UpdateUserRequest;
import com.example.my_everything.response.CreateUserResponse;
import com.example.my_everything.response.GetUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class MyEverythingApplication {

	//buat list untuk menampung data
	private List<CreateUserResponse> users = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}

	@GetMapping("/users")
	public List<CreateUserResponse> getUser(){
		//return response
		return users;
	}
	
	@GetMapping("/users/get")
	public ResponseEntity<List<GetUserResponse>> getUserbyId(
			@RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "size", defaultValue = "1") int size
	) {
		int i = ((page - 1) * size);
		int start = i;
		List<GetUserResponse> tampung = new ArrayList<>();

		while (i < (start + size) && i < users.size()) {
			tampung.add(GetUserResponse.builder()
					.id(users.get(i).getId())
					.name(users.get(i).getName())
					.status(users.get(i).getStatus())
					.type(users.get(i).getType())
					.build());
			i++;
		}
		return new ResponseEntity<>(tampung, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<CreateUserResponse> getUserbyId(
			@PathVariable("id") Long id)
	{
		//check
		for (CreateUserResponse user : users) {
			if (user.getId() == id) {
				//return user berdasarkan id
				return new ResponseEntity<>(user, HttpStatus.OK);
			}
		}
		// Jika user tidak ditemukan
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	@PostMapping("/users/add")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserResponse request)
	{
		long finalId;

		if (request.getName()!=null && request.getStatus()!=null && request.getType()!=null) {
			if (users.isEmpty()) {
				finalId = 0;
			} else {
				finalId = users.getLast().getId();
			}
			users.add(CreateUserResponse.builder()
					.id(finalId + 1)
					.name(request.getName())
					.status(request.getStatus())
					.type(request.getType())
					.build());
			//return response
			return new ResponseEntity<>(users, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@PatchMapping("/users/patch/{id}")
	public ResponseEntity<List<CreateUserResponse>> updatepartUser(
			@RequestBody UpdateUserRequest request,
			@PathVariable("id") Long id) {

		//check
		for (CreateUserResponse user : users) {
			if (user.getId()==id) {

				//Update sesuai data yang diberikan
				if (request.getName() != null) {
					user.setName(request.getName());
				} if (request.getStatus() != null) {
					user.setStatus(request.getStatus());
				} if (request.getType() != null) {
					user.setType(request.getType());
				}
			}
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PutMapping("/users/put/{id}")
	public ResponseEntity<List<CreateUserResponse>> updateUser(
			@RequestBody UpdateUserRequest request,
			@PathVariable("id") Long id) {

		//check
		for (CreateUserResponse user : users) {
			if (user.getId()==id && request.getName()!=null && request.getStatus()!=null && request.getType()!=null) {
				user.setName(request.getName());
				user.setStatus(request.getStatus());
				user.setType(request.getType());
			}
		}

		//return response
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@DeleteMapping("/users/delete/{id}")
	public ResponseEntity<String> deleteUser(
			@PathVariable Long id
	) {
		boolean isUserExists = true;

		//cari user berdasarkan id
		for (CreateUserResponse user : users){
			if(user.getId() == id){
				users.remove(user);
				isUserExists = false;
				break;
			}
		}

		//response jika pengguna ditemukan
		if (isUserExists == false) {
			return new ResponseEntity<>("User berhasil dihapus", HttpStatus.OK);
		}
		return new ResponseEntity<>("ID tersebut tidak ada", HttpStatus.NOT_FOUND);
    }
}