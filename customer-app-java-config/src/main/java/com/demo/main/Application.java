package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = appContext.getBean(CustomerService.class);
		System.out.println(service);
		System.out.println(service.findAll().get(0).getFirstName());
		
		CustomerService service2 = appContext.getBean(CustomerService.class);
		System.out.println(service2);
	}

}
