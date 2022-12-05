package com.example.testdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins  =  "http://localhost:8080")
public class TestDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDeployApplication.class, args);
	}

	@GetMapping("/welcome")
	public String appWelcome(){
		return "Welcome to my API";
	}

	@GetMapping("/names")
	public List<String> showNames(){
		return List.of("A", "B", "C");
	}

}
