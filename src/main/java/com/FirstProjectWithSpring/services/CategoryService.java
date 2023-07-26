package com.FirstProjectWithSpring.services;

import com.FirstProjectWithSpring.entities.Category;
import com.FirstProjectWithSpring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long Id) {
        Optional<Category> obj = categoryRepository.findById(Id);
        return obj.get();
    }
}
