package com.ashley.spring.demo2;

import com.ashley.spring.demo2.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main (String[] args){
        /*
         *This here is the creation and the runing of the application.
         * Firstly we define where the beans configuration / context is / what it is called
         * We then get a bean
         * Lastly we use the bean.
         * */

        /*
         *As of this commit the application is fully working and @Autowired together
         * */
        ApplicationContext appContext = new
                AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());

    }
}
