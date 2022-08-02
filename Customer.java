package com.example.mvc.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private String name;
    private String emailId;
    private String contactNo;

    @JsonManagedReference
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CustomerAddress> customerAddressList = new ArrayList<>();

    public List<CustomerAddress> getCustomerAddressList() {
        return customerAddressList;
    }

    public void setCustomerAddressList(List<CustomerAddress> customerAddressList) {
        this.customerAddressList = customerAddressList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
