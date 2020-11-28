package com.example.shop.services;

import com.example.shop.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
interface CartService {

    List<Product> getProducts();
//    Product getProduct(int id);

    boolean addProduct(int id);

    boolean deleteProduct(int id);
}
