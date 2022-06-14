package com.stock.stock.controller;


import com.stock.stock.controller.api.CategoryApi;
import com.stock.stock.dto.ProduitDto;
import com.stock.stock.entites.Category;
import com.stock.stock.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CategoryController implements CategoryApi {


    @Override
    public ProduitDto save(ProduitDto produitDto) {
        return null;
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
