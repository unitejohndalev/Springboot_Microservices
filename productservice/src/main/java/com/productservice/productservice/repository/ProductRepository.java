package com.productservice.productservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.productservice.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, String> {
    
}
