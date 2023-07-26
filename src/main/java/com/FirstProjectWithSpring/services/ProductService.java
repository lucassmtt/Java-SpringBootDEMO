package com.FirstProjectWithSpring.services;

import com.FirstProjectWithSpring.entities.Product;
import com.FirstProjectWithSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productService;

    public List<Product> findAll() {
        return productService.findAll();
    }

    public Product findById(Long Id) {
        Optional<Product> obj = productService.findById(Id);
        return obj.get();
    }
}