package com.example.shop.services;

import com.example.shop.models.Product;
import com.example.shop.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    private List<Product> cart = new ArrayList<>();

    private ProductsRepository repository;

    @Autowired
    public CartServiceImpl(ProductsRepository repository){
        this.repository = repository;
    }

    @Override
    public boolean addProduct(int id){
        Product prod = repository.getProduct(id);
        if (prod == null){
            return false;
        }
        cart.add(prod);
        return true;
    }

    @Override
    public List<Product> getProducts(){
        return cart;
    }

    @Override
    public boolean deleteProduct(int id){
        Product prod = repository.getProduct(id);
        if (prod == null){
            return false;
        }
        cart.remove(prod);
        return true;
    }

}
