package com.sathya.jenkns.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	
	@GetMapping("/")
	public String sayHello() {
		return "Spring Boot Updated ";
	}
	

}
