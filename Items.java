package com.ecommerce.mvc.models;


public class Items {
    private Product product;
    private int quantity;

    public Items(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getPrice(){
        return product.getPrice()*quantity;
    }
}
