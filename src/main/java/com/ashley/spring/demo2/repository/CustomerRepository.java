package com.ashley.spring.demo2.repository;

import com.ashley.spring.demo2.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
