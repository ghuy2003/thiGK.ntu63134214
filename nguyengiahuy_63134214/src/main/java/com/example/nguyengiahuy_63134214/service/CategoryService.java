package com.example.nguyengiahuy_63134214.service;

import com.example.nguyengiahuy_63134214.models.Category;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    public List<Category> getAllCategories() {
        return List.of(
            new Category(1L, "Danh mục 1"),
            new Category(2L, "Danh mục 2"),
            new Category(3L, "Danh mục 3")
        );
    }
}
