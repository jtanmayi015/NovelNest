package com.app.service;

import java.util.List;

import com.app.Entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);
}
