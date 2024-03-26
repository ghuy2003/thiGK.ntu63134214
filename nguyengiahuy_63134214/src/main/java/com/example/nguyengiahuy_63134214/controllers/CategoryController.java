package com.example.nguyengiahuy_63134214.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nguyengiahuy_63134214.models.*;
import com.example.nguyengiahuy_63134214.service.*;
import java.util.List;


@RestController

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    
    
}
