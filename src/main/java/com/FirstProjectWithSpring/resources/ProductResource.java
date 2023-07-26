package com.FirstProjectWithSpring.resources;

import com.FirstProjectWithSpring.entities.Product;
import com.FirstProjectWithSpring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list_products = productService.findAll();
        return ResponseEntity.ok().body(list_products);
    }

    @GetMapping(value = "/{Id}")
    public ResponseEntity<Product> findById(@PathVariable Long Id) {
        Product product = productService.findById(Id);
        return ResponseEntity.ok().body(product);
    }
}