package com.example.productapp.model;

import jdk.jfr.Enabled;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter

@Setter
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "product_id")
    private  String productId=UUID.randomUUID().toString();
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private double price;
}
