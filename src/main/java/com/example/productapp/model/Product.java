package com.example.productapp.model;

import jdk.jfr.Enabled;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter

@Setter
@Builder
public class Product {
    private  String productId;
    private String productName;
    private double price;
}
