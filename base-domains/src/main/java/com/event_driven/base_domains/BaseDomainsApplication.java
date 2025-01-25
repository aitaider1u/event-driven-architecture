package com.event_driven.base_domains;

import com.event_driven.base_domains.dto.Order;
import com.event_driven.base_domains.dto.OrderEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseDomainsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseDomainsApplication.class, args);
		Order order = new Order();
		order.setOrderId("rererer");
	}

}
