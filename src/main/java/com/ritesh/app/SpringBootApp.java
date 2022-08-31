package com.ritesh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication is equivalent to using
@Configuration, @EnableAutoConfiguration, and @ComponentScan
*/
@SpringBootApplication
public class SpringBootApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootApp.class, args);
	}
}
