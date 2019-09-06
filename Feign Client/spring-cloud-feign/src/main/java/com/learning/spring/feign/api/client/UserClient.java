package com.learning.spring.feign.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.spring.feign.api.dto.UserResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient(url ="${app.url}", name = "USER-CLIENT")
public interface UserClient {
	
	//@HystrixCommand(fallbackMethod = "defaultUser")
	@GetMapping("/users")
	public List<UserResponse> getUsers();

}





	