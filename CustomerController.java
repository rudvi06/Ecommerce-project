package com.ecommerce.mvc.controllers;

import com.ecommerce.mvc.models.Customer;
import com.ecommerce.mvc.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/account")
    public Customer getCustomer(@RequestParam(value = "name" ) String name,
                                @RequestParam(value = "emailId") String emailId,
                                @RequestParam(value = "contactNo") String contactNo){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmailId(emailId);
        customer.setContactNo(contactNo);
        return customer;
    }

    @PostMapping("/account")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.saveAndFlush(customer);
    }
}
