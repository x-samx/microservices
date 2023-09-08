package com.test.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		System.out.println("Program running");
		SpringApplication.run(EmployeeApplication.class, args);

	}

}
