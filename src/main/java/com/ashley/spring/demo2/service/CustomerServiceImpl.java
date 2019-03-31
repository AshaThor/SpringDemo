package com.ashley.spring.demo2.service;

import com.ashley.spring.demo2.model.Customer;
import com.ashley.spring.demo2.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public List<Customer> findAll(){
            return customerRepository.findAll();
        }

}
