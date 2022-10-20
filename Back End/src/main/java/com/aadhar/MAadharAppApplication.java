package com.aadhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.aadhar.bean")
@EnableJpaRepositories(basePackages = "com.aadhar.repository")
public class MAadharAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MAadharAppApplication.class, args);
		System.out.println("Server running on port number 9090");
	}

}