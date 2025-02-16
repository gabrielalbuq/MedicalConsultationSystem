package com.gmg.systemweb.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.gmg.systemweb.security.service.EmailService;

@SpringBootApplication
public class DemoSecurityApplication{

	public static void main(String[] args) {

		SpringApplication.run(DemoSecurityApplication.class, args);
	}

	@Autowired
	EmailService service;
}
