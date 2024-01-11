package com.demo.main;

import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
