package com.example.nguyengiahuy_63134214.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.nguyengiahuy_63134214.models.Category;
import com.example.nguyengiahuy_63134214.service.CategoryService;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ViewController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String home(Model model){
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "index";
    }
}
