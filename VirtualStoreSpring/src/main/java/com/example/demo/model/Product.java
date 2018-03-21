package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    public static List<Product> productList;

    static {
        productRepository();
    }

    public Product(){}

    public Product(String productName){
        this.productName = productName;
    }

    public Product(String productName, int productId, double productPrice){
        this(productName);
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public int getproductId() {
        return productId;
    }

    public String getproductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    private static void productRepository() {
        productList = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId);
    }
}
