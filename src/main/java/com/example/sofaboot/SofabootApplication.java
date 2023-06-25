package com.example.sofaboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class SofabootApplication {

	public static void main(String[] args) {
		System.out.println("run as server");
		runAsServer(args);
	}

	private static void runAsServer(String[] args) {

		SpringApplication.run(SofabootApplication.class, args);
	}

}
