package com.group3finalproject.bloghub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.group3finalproject.bloghub.repository")
public class BloghubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloghubApplication.class, args);
	}

}
