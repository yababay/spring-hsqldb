package com.example.shop;

import com.example.shop.models.Product;
import com.example.shop.repository.ProductsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ProductsRepository repository = getRepositoryFromJavaConfig();
		for(Product product:repository.getProducts()){
			System.out.println(product);
		}
	}
	private static ProductsRepository getRepositoryFromJavaConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		return context.getBean(ProductsRepository.class);
	}

}
