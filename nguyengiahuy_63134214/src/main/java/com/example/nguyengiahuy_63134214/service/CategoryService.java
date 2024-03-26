package com.example.nguyengiahuy_63134214.service;

import com.example.nguyengiahuy_63134214.models.Category;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    public List<Category> getAllCategories() {
        return List.of(
            new Category(1L, "Táo"),
            new Category(2L, "Lê"),
            new Category(3L, "Ổi")
        );
    }
}
