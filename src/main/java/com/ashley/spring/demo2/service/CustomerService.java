package com.ashley.spring.demo2.service;

import com.ashley.spring.demo2.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
