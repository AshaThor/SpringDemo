package com.ashley.spring.fundamentals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
/*
 * Here above ^ I am defining this as a configuration class. I am then below v saying that to find beans you need to
 * "scan" this package and fins any annotations and wire them up.
 * */
@ComponentScan({"com.ashley.spring.fundamentals"})
@PropertySource("application.properties")
public class AppConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    /**
     *Using Spring and @Autowire I can set this class up to "Scan" for the beans using the above @ComponentScan and
     * I can have stereotype annotarions, @Repository, @Component, @Service and this will detect a class as a bean and
     * using @AutoWire I can the string together the classes, methods and setters through injection
     *
     *
    * */

//    @Bean(name="customerService")
    /**
     *If you do not use the (name=xyz) it will default to the method name in the creation of a bean. In the instance
     * below that would lead to the creation of a bean being names "getCustomerService"
     * */
//    public CustomerService getCustomerService(){
//        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
//        service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }

    /**
     *The code above and below is commented out due to a lack to requirement. As seen in the "CustomerServiceImpl"
     * and the "HibernateCustomerRepositoryImpl" they are annotated with @Repository and @Service. This means that upon
     * scan they are detected as a bean and therefore do not need to be defined here as a bean
     * */
//    @Bean(name="customerRepository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }

}
