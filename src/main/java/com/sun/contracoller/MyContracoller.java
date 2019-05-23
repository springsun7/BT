package com.sun.contracoller;

import com.sun.po.Customer;
import com.sun.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyContracoller {

    @Autowired
    private CustomerRepository customerRepository;


    @RequestMapping("/doSomething")
    public String doSomething() throws Exception {
//        customerRepository.findBySql();
        Iterable<Customer> all = customerRepository.findAll();
        System.out.println(all);
        return "hello";
    }
}
