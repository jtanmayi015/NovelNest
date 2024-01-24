package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.Entity.Customer;
import com.app.service.CustomerService;

public class CustomerController {
	 private final CustomerService customerService;

	    public CustomerController(CustomerService customerService) {
	        this.customerService = customerService;
	    }

	    @GetMapping
	    public List<Customer> getAllCustomers() {
	        return customerService.getAllCustomers();
	    }

	    @GetMapping("/{id}")
	    public Customer getCustomerById(@PathVariable Long id) {
	        return customerService.getCustomerById(id);
	    }

	    @PostMapping
	    public Customer saveCustomer(@RequestBody Customer customer) {
	        return customerService.saveCustomer(customer);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCustomer(@PathVariable Long id) {
	        customerService.deleteCustomer(id);
	    }
}
