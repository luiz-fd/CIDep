package com.luizfd.CIDep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luizfd.CIDep.entities.Order;
import com.luizfd.CIDep.services.OrderService;

@SpringBootApplication
public class CiDepApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	public CiDepApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(CiDepApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1= new Order(1034,150.00,20.00);
		System.out.println("Pedido Código " + order1.getCode());
		System.out.println("Valor Total: " + orderService.total(order1));
		Order order2= new Order(2282,800.00,10.00);
		System.out.println("Pedido Código " + order2.getCode());
		System.out.println("Valor Total: " + orderService.total(order2));
		Order order3= new Order(1309,95.90,0.00);
		System.out.println("Pedido Código " + order3.getCode());
		System.out.println("Valor Total: " + orderService.total(order3));
		
	}

}
