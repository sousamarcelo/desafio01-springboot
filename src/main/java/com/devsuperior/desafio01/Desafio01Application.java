package com.devsuperior.desafio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio01.entities.Order;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(200, 1000.00, 500.00);
		System.out.println(order);
		
	}

}
