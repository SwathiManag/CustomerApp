package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Customer;

public class InMemoryCustomerRepositoryImpl implements CustomerRepository {

	List<Customer> customers = new ArrayList<>();
	
	public InMemoryCustomerRepositoryImpl() {
		Customer customer = new Customer();
		customer.setFirstName("John");
		customer.setLastName("Doe");
		customers.add(customer);
	}
	
	public List<Customer> findAll() {
		return customers;
	}

}
