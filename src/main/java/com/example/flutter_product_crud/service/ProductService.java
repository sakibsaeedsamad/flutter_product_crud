package com.example.flutter_product_crud.service;


import java.util.List;

import com.example.flutter_product_crud.model.Product;
import com.example.flutter_product_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getProduct() {
        return repository.findAll();
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed" + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

    public Product getProductById(int id) {

        return repository.findById(id).orElse(null);
    }

    public Product getByName(String name) {
        return repository.findByName(name);
    }

}
