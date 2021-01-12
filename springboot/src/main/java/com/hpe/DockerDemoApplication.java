package com.hpe;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

	//	docker run -e FLASK_HOST_NAME=python-flask-app -e FLASK_PORT_NUMER=5000 --rm -d ...
	@Value("${FLASK_HOST_NAME:flaskapp}")
	String flaskHostName;

	@Value("${FLASK_PORT_NUMBER:1234}")
	String flaskPortNumber;

	@GetMapping("/api/flaskapp-author")
	public String flaskappAuthorInfo() {
		String url = "http://" + flaskHostName + ":" + flaskPortNumber + "/api/author";
		RestTemplate template = new RestTemplate();
		return template.getForEntity(url, String.class).getBody();
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
