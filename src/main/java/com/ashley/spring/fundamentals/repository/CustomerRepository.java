package com.ashley.spring.fundamentals.repository;

import com.ashley.spring.fundamentals.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
