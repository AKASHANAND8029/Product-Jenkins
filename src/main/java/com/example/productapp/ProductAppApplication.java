package com.example.productapp;

import com.example.productapp.model.Product;
import com.example.productapp.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ProductAppApplication implements CommandLineRunner {
    private final ProductRepository productRepository;
@Autowired
    public ProductAppApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        productRepository.save(new Product(UUID.randomUUID().toString(),"Pen",20));
//        productRepository.save(new Product(UUID.randomUUID().toString(),"Pencil",21));
//        productRepository.save(new Product(UUID.randomUUID().toString(),"Book",22));
//        productRepository.save(new Product(UUID.randomUUID().toString(),"Colors",23));
//        productRepository.save(new Product(UUID.randomUUID().toString(),"Notebooks",24));
        productRepository.save(new Product(UUID.randomUUID().toString(),"Stickers",24));

    }
}
