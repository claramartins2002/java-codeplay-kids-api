package com.tcc.codeplay_kids_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CodeplayKidsApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(CodeplayKidsApiApplication.class, args);
	}

}
