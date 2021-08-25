package com.example.flutter_product_crud.repository;

import com.example.flutter_product_crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    Product findByName(String name);

}
