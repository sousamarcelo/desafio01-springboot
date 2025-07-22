package com.devsuperior.desafio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
	
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		List<Order> list = new ArrayList<>();
		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);
		
		list.add(order1);
		list.add(order2);
		list.add(order3);
		
		for (Order order : list) {
			System.out.println("\nPedido códito " + order.getCode());
			System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));
		}		
	}
}
