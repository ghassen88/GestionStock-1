package com.stock.stock.controller;


import com.stock.stock.entites.Category;
import com.stock.stock.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categorie")
public class CategoryController {


    @Autowired
    CategoryServiceImpl categoryService;

    @PostMapping(value = "/addCat")
    public void  AjouterCat(Category category){


        categoryService.Ajouter(category);
    }
}
