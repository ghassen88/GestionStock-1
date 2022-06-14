package com.stock.stock.controller;


import com.stock.stock.controller.api.CategoryApi;
import com.stock.stock.dto.ProduitDto;
import com.stock.stock.entites.Category;
import com.stock.stock.service.ProduitService;
import com.stock.stock.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CategoryController implements CategoryApi {


    @Autowired
    ProduitService produitService;

    @Override
    public ProduitDto save(ProduitDto produitDto) {
        return produitService.save(produitDto);
    }

    @Override
    public ProduitDto findById(Integer id) {
        return null;
    }

    @Override
    public List<ProduitDto> finAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
