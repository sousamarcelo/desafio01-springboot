package com.devsuperior.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio01.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	public double total(Order order) {
		return (order.getBasic() * (1- order.getDiscount()/100)) + shippingService.shipment(order);
	} 

}
