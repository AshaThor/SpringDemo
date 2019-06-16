package com.ashley.spring.fundamentals.service;

import com.ashley.spring.fundamentals.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
