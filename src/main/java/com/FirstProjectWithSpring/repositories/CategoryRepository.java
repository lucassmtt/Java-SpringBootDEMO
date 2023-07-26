package com.FirstProjectWithSpring.repositories;

import com.FirstProjectWithSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
