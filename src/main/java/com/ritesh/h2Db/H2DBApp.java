package com.ritesh.h2Db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication is equivalent to using
@Configuration, @EnableAutoConfiguration, and @ComponentScan
*/
@SpringBootApplication
public class
H2DBApp {

	public static void main(String[] args) {
		SpringApplication.run(H2DBApp.class, args);
	}

}
