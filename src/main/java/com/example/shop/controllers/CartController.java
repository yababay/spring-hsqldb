package com.example.shop.controllers;

import com.example.shop.models.Product;
import com.example.shop.services.CartServiceImpl;
import com.example.shop.services.ProductsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private CartServiceImpl service;

    @Autowired
    public CartController(CartServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/cart")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/cart/add/{id}")
    public boolean addProduct(@PathVariable(name = "id") int id){
        return service.addProduct(id);
    }

    @GetMapping("/cart/delete/{id}")
    public boolean deleteProduct(@PathVariable(name = "id") int id){
        return service.deleteProduct(id);
    }
}
