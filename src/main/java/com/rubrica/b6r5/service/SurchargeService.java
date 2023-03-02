package com.rubrica.b6r5.service;

import org.springframework.stereotype.Component;
import com.rubrica.b6r5.generated.SurchargeRequest.Order;

@Component
public class SurchargeService {
	public int calculateSurcharge(Order order) {
		int surcharge = 15;
		if (order.getCustomer().getAddress().getCountry().equals("US"))
			surcharge = 10;
		if (order.getPaymentMethod().equals("CC"))
			surcharge += 3;
		if (order.getValue() > 1000)
			surcharge -= 1;
		return surcharge;
	}
}