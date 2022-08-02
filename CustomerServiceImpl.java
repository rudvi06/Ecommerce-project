package com.example.mvc.service;

import com.example.mvc.model.Customer;
import com.example.mvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    @Transactional
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
