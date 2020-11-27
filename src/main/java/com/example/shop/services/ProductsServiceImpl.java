package com.example.shop.services;

import com.example.shop.models.Product;
import com.example.shop.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.google.common.collect.Lists;


@Service
public class ProductsServiceImpl implements ProductsService {
    private ProductsRepository repository;

    @Autowired
    public ProductsServiceImpl(ProductsRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Product> getProducts(){
        return repository.getProducts();
    }

    @Override
    public Product getProduct(int id){
        for(Product product:repository.getProducts()){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }
}

