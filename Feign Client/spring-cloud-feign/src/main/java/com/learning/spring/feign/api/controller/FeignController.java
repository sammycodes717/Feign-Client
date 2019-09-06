package com.learning.spring.feign.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.feign.api.client.UserClient;
import com.learning.spring.feign.api.dto.UserResponse;

@RestController
public class FeignController {

	@Autowired
	private UserClient userClient;

	@GetMapping("/findAllUser")
	//@HystrixCommand(fallbackMethod = "defaultUser")
	public List<UserResponse> getAllUser() {
		
		return userClient.getUsers();
	}
	
	public List<UserResponse> defaultUser(){
		System.out.println("i came here");
		return null;
	}

}
