package com.example.bootcon;

import com.example.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootConApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootConApplication.class, args);
	}

	@RequestMapping("/")
	public String aaa(int a){
		return "1111";
	}
}
