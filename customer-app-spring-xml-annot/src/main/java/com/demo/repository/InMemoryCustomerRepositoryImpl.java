package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository("customerRepository")
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
