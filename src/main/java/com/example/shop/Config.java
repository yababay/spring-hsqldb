package com.example.shop;

import com.example.shop.repository.ProductsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.repositiry")
public class Config {
    @Bean
    public ProductsRepository repository(){
        ProductsRepository repository = new ProductsRepository();
        return repository;
    }
//
//    @Bean
//    public Engine engine() {
//        Engine engine = new Engine();
//        engine.setType("v8");
//        engine.setVolume(5);
//        return engine;
//    }
//
//    @Bean
//    public Transmission transmission() {
//        Transmission transmission = new Transmission();
//        transmission.setType("sliding");
//        return transmission;
//    }
//
//    @Bean
//    public Trailer trailer() {
//        Trailer trailer = new Trailer();
//        return trailer;
//    }
}
