package com.example.shop.controllers;

import com.example.shop.models.Product;
import com.example.shop.services.ProductsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductsServiceImpl service;

    @Autowired
    public ProductController(ProductsServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable(name = "id") int id){
        try{
            return new ResponseEntity<>(service.getProduct(id), HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
