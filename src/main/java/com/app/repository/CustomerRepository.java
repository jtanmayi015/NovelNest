package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
