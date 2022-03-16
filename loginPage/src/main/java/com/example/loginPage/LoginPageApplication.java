package com.example.loginPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
		"com.example.loginPage"})
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.example.loginPage"})
public class LoginPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginPageApplication.class, args);
	}

}
