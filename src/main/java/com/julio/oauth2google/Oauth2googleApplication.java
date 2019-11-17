package com.julio.oauth2google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class Oauth2googleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2googleApplication.class, args);
	}

	@RequestMapping(value = "/user")
	public Principal user(Principal principal) {
		return principal;
	}

}
