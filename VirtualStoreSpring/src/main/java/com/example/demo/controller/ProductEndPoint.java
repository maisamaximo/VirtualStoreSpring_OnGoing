package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.model.Product.productList;

@Controller
@RequestMapping("products")
public class ProductEndPoint {

    @GetMapping
    public ResponseEntity<?> showAllProducts(){
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addNewProduct(@RequestBody Product product){
        productList.add(product);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping
    public void deleteProduct(){

    }

    @PutMapping
    public void updateProduct(){

    }

}
