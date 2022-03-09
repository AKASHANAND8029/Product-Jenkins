package com.example.productapp.controller;

import com.example.productapp.model.Product;
import com.example.productapp.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;
@Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Added Post Method
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product)
    {
        return ResponseEntity.ok(productRepository.save(product));
    }
    //Added Get Method
    @GetMapping("/products")
    public ResponseEntity<List<Product>> displayProduct() {
        List<Product> list=new ArrayList<>();
        Iterable<Product> iterable= productRepository.findAll();
        Iterator<Product> iterator= iterable.iterator();
        while (iterator.hasNext())
        {
            list.add(iterator.next());
        }
        return ResponseEntity.ok(list);


    }


}
