package com.example.bootconsummer;

import com.example.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootConsummerApplication {

	@Autowired(required = false)
	private UserServerImpp userServerImpp;

	public static void main(String[] args) {
		SpringApplication.run(BootConsummerApplication.class, args);
	}

	@RequestMapping("/aaa")
	public User aaa(int a){
		return userServerImpp.getUser(a);
	}

}
