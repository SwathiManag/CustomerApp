package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.demo"}) //to use annotations @Service and @Repository on classes
@PropertySource("application.properties")
public class AppConfig {
	
//	Using Beans instead of annotations @Service and @Repository
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new InMemoryCustomerRepositoryImpl();
//	}
	
//	@Bean(name="customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository()); // this is constructor based
////		service.setCustomerRepository(getCustomerRepository()); //this is setter based
//		return service;
//	}
	
}
