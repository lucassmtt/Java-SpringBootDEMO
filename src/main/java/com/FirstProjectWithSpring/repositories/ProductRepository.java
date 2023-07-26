package com.FirstProjectWithSpring.repositories;

import com.FirstProjectWithSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
