package com.ecommerce.mvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoppingCart {

    private int id;

    private List<Items> items= new ArrayList<>();

    public void addItems(Items item) {
        items.add(item);
    }

    public int getTotalCost(){
        return items.stream().mapToInt(Items::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
