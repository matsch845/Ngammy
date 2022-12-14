package com.project.PlanMyPlate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PlanMyPlateApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanMyPlateApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam String name){
		return String.format("Hello %s!", name);
	}
}
