package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
		//	Autowiring by member variable - by name annotation
		//@Autowired
		private CustomerRepository customerRepository;
	
		//	Autowiring by setter - by type annotation
		//@Autowired
		public void setCustomerRepository(CustomerRepository customerRepository) {
			this.customerRepository = customerRepository;
			System.out.println("Inside setter method!!!");
		}
		
		//	Autowiring by constructor - constructor annotation
		@Autowired
		public CustomerServiceImpl(CustomerRepository customerRepository) {
			this.customerRepository = customerRepository;
			System.out.println("Inside constructor!!!");
		}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
