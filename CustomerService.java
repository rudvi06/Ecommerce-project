package com.example.mvc.service;

import com.example.mvc.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> findAll();
}
