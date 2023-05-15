package com.luizfd.CIDep.services;

import org.springframework.stereotype.Service;

import com.luizfd.CIDep.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		
		Double temp = order.getBasic();
		
		if(temp > 200.00) {
			return 0.0;
		}
		else if(100.00 < temp && temp <= 200.00) {
			return 12.00;
		}
		else {
			return 20.00;
		}
	}

}
