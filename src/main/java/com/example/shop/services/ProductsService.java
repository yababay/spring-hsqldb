package com.example.shop.services;


import com.example.shop.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
interface ProductsService {

    List<Product> getProducts();
    Product getProduct(int id);
}
