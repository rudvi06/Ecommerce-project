package com.ecommerce.mvc.controllers;

import com.ecommerce.mvc.models.Product;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    @GetMapping("/product")
    public List<Product> listProducts(){
        List<Product> products= new ArrayList<>();
        //get list from database
        return products;
    }
}
