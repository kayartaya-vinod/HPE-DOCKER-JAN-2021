package com.hpe;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}
	

	@GetMapping("/api/author")
	public Map<String, String> authorInfo() {
		Map<String, String> author = new HashMap<>();
		author.put("name", "Vinod Kumar");
		author.put("email", "vinod@vinod.co");
		author.put("phone", "9731424784");
		return author;
	}

}
