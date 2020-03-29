package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Value("${com.demo.title}")
    private String title;
    @Value("${com.demo.phone}")
    private String phone;
    @Value("${com.demo.description}")
    private String description;






}
