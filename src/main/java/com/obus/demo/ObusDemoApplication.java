
package com.obus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ObusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObusDemoApplication.class, args);
	}

	@GetMapping
	public String index() {
		return "Welcome";
	}
}
