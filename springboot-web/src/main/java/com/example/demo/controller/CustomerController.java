package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private  Properties properties;

    @RequestMapping("/getCustomer")
    public Customer getCustomer() {
        Customer customer=new Customer();
        customer.setUserName("张亮");
        customer.setPassWord("13128600812");
        return customer;
    }

    @RequestMapping("/getProperties")
    public Properties getProperties() {
        return properties;
    }

}
