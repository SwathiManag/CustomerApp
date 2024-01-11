package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

@Service("CustomerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
	
	@Value("${hello.myname}")
	private String name;
	
	@Value("${jdbc.connection.database}")
	private String dbServer;
	
	@Value("${jdbc.mysql.driver}")
	private String mysqlDriver;
	
	CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("inside constructor");
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println(name + "==>" + dbServer + "==>" + mysqlDriver);
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
