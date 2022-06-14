package com.stock.stock.service;

import com.stock.stock.dto.CategoryDto;
import java.util.List;

public interface CategoryService {


    CategoryDto save(CategoryDto categoryDto);

    CategoryDto findById(Integer id);


    List<CategoryDto> finAll();

    void delete(Integer id);
}

