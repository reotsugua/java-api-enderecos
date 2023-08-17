package com.projeto.logradouros;

import com.projeto.logradouros.controller.TesteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogradourosApplication {

	@Autowired
	private static TesteController controller;

	public static void main(String[] args) {
		SpringApplication.run(LogradourosApplication.class, args);
	}

}
