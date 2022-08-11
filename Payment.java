package com.ecommerce.mvc.models;

import java.util.UUID;

public class Payment {
    private CreditCard creditCard;
    private int value;
    private UUID identifier;
    public Payment(CreditCard creditCard, int value, UUID randomUUID) {
        this.creditCard = creditCard;
        this.value=value;
        this.identifier=randomUUID;
    }
}
