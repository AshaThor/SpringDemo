package com.ashley.spring.fundamentals.repository;

import com.ashley.spring.fundamentals.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/**
 *This below annotation is such at when "AppConfig" scans the package this class is seen as a bean. I have also named
 * the bean as an easier convention method
 * */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    /**
     * This has been pulled in from application.properties for now
     * See application.properties and AppConfig
     * **/
    @Value("${dbUsername}")
    private String dbusername;

    @Override
    public List<Customer> findAll(){
        System.out.println(dbusername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Billy");
        customer.setLastName("Nomat");
        customers.add(customer);
        return customers;
    }
}
