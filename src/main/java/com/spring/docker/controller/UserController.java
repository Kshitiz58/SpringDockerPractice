package com.spring.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/view")
public class UserController {

	@GetMapping("/user")
	public String getMessage() {
		return "Welcome to the Docker Container!!";
	}
	
}
