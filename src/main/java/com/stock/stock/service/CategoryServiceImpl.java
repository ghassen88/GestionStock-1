package com.stock.stock.service;

import com.stock.stock.entites.Category;
import com.stock.stock.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl {

    @Autowired
    CategoryRepository categoryRepository;



    public void Ajouter(Category category){
        categoryRepository.save(category);

    }
}
