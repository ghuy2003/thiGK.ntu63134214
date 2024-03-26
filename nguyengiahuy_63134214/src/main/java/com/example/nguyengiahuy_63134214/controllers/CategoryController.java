package com.example.nguyengiahuy_63134214.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.nguyengiahuy_63134214.models.*;
import com.example.nguyengiahuy_63134214.service.*;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    
    
}
