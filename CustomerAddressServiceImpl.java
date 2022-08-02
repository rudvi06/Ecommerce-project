package com.example.mvc.service;

import com.example.mvc.model.CustomerAddress;
import com.example.mvc.repository.CustomerAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {

    @Autowired
    private CustomerAddressRepository customerAddressRepository;

    @Override
    @Transactional
    public CustomerAddress addCustomerAddress(CustomerAddress customerAddress){
        customerAddress = customerAddressRepository.save(customerAddress);
        return customerAddress;
    }

}
