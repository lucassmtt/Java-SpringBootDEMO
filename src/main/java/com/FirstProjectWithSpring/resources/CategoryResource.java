package com.FirstProjectWithSpring.resources;

import com.FirstProjectWithSpring.entities.Category;
import com.FirstProjectWithSpring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = categoryService.findAll();
        return ResponseEntity.ok().body(categories);
    }

    @GetMapping(value = "/{Id}")
    public ResponseEntity<Category> findById(@PathVariable Long Id) {
        Category category = categoryService.findById(Id);
        return ResponseEntity.ok().body(category);
    }
}
