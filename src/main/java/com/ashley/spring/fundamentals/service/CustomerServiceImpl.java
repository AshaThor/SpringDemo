package com.ashley.spring.fundamentals.service;

import com.ashley.spring.fundamentals.model.Customer;
import com.ashley.spring.fundamentals.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *This below annotation is such at when "AppConfig" scans the package this class is seen as a bean. I have also named
 * the bean as an easier convention method
 * */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){}

    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("Constructor injection");
        this.customerRepository = customerRepository;
    }

    /**
     *The below annotation of "@AutoWired" is such that when the bean for this class is called it will Automatically
     * wire to this setter if required. This is a use of setter injection
     *
     *
     * */
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter injection");
        this.customerRepository = customerRepository;
    }
    @Override
    public List<Customer> findAll(){
            return customerRepository.findAll();
        }

}
