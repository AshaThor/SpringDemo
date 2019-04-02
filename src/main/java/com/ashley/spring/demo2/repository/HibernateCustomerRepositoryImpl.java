package com.ashley.spring.demo2.repository;

import com.ashley.spring.demo2.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/**
 *This below annotation is such at when "AppConfig" scans the package this class is seen as a bean. I have also named
 * the bean as an easier convention method
 * */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Billy");
        customer.setLastName("Nomat");
        customers.add(customer);
        return customers;
    }
}
