package com.hpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
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
