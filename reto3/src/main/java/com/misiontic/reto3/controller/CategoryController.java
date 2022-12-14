package com.misiontic.reto3.controller;


import com.misiontic.reto3.entities.Category;
import com.misiontic.reto3.entities.Product;
import com.misiontic.reto3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category p){
        return categoryService.save(p);
    }
}
