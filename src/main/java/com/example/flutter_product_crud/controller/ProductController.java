package com.example.flutter_product_crud.controller;


import com.example.flutter_product_crud.model.Product;
import com.example.flutter_product_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {

        return service.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> findAllUsers(){
        return service.getProduct();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

}
