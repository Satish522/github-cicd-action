package com.satish.github.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubCicdActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Github Action";
	}
	

}
