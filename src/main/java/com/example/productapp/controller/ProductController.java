package com.example.productapp.controller;

import com.example.productapp.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ProductController {

    @PostMapping("/products")
    public ResponseEntity<Product> displayProduct(Product product)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @GetMapping("/products")
    public ResponseEntity<Product> createProduct(){
        return ResponseEntity.ok(Product.builder().productId(UUID.randomUUID().toString()).productName("Pencil").price(15.0).build());
    }


}
