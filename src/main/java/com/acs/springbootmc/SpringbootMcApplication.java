package com.acs.springbootmc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMcApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}

