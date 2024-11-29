package com.springdemo.userapi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserDetails")
public class UserController {
	
	User user;
	@GetMapping("{userId}")
	public User getUser(String userId) {
//		return new User("C1", "Meghana", "Rao", "Address");
		return this.user;
	}
	
	@PostMapping
	public String createUser(@RequestBody User newUser) {
		this.user = newUser;
		return "Successful";
	}
	
	@PutMapping
	public String updateUser(@RequestBody User updatedUser) {
		this.user =  updatedUser;
		return "Updated user";
	}
	
	@DeleteMapping
	public String deleteUser(String id) {
		this.user = null;
		return "Deleted";
	}
	
	
}
