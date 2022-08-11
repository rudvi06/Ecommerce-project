package com.ecommerce.mvc.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Optional;
import java.util.UUID;
@Entity
public class CreditCard implements PaymentMethod{
    private final long cardNumber;

    @OneToOne
    private Customer customer;

    public CreditCard(long cardNumber, Customer customer) {
        this.cardNumber = cardNumber;
        this.customer = customer;
    }
    @Override
    public Optional<Payment> makePayment(int value){
        if(Math.random()>0.3)
            return Optional.of(new Payment(this,value, UUID.randomUUID()));
        else
            return Optional.empty();
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                '}';
    }
}
