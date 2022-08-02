package com.example.mvc.Controller;

import com.example.mvc.model.Customer;
import com.example.mvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("login")
    public List<Customer> getCustomers(){
        List<Customer> customers = customerService.findAll();
        return customers;
    }

    @PostMapping("login")
    public Customer addCustomer(@Valid @ModelAttribute("login") Customer customer, BindingResult result){
        if(result.hasErrors()){
            customer.setName("error");
        }
        customerService.save(customer);
        return customer;
    }

}
