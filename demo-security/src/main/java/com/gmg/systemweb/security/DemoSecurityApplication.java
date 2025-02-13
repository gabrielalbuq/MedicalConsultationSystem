package com.gmg.systemweb.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
=======
>>>>>>> 634f6f3b34a1e3956b3cf80ed0e7eaf55f68d55d

@SpringBootApplication
public class DemoSecurityApplication {

	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
=======
>>>>>>> 634f6f3b34a1e3956b3cf80ed0e7eaf55f68d55d
		SpringApplication.run(DemoSecurityApplication.class, args);
	}
}
