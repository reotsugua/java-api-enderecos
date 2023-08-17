package com.projeto.logradouros;

import com.projeto.logradouros.controller.TesteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LogradourosApplication {

	@Autowired
	private static TesteController controller;

	public static void main(String[] args) {

		SpringApplication.run(LogradourosApplication.class, args);
		System.out.println(controller);
	}



}
