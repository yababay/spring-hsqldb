package com.example.shop.repository;

import com.example.shop.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepository {
    private static List<Product> products;

    public Product getProduct(int id){
        for(Product product:products){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public List<Product>getProducts(){return products;}
    public ProductsRepository(){
        products = new ArrayList<Product>();
        products.add(new Product(1, "lemon", 30.5));
        products.add(new Product(2, "orange", 20.5));
        products.add(new Product(3, "apple", 40.7));
        products.add(new Product(4,"pineapple",29));
        products.add(new Product(5,"mango",18));
    }
}
