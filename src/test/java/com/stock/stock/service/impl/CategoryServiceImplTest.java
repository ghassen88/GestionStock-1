package com.stock.stock.service.impl;

import com.stock.stock.dto.CategoryDto;
import com.stock.stock.service.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryServiceImplTest {

    @Autowired
    CategoryService categoryService;

  @Test
    public void shoudSaveCategoryWithSuccess() {

        CategoryDto expectedCategory = CategoryDto.builder().
                id(1)
                .code("fff")
                .libelle("informatique")
                .build();

        CategoryDto saveCategory = categoryService.save(expectedCategory);

           Assertions.assertNotNull(saveCategory);
           Assertions.assertNotNull(saveCategory.getId());
           Assertions.assertEquals(expectedCategory.getId(),saveCategory.getId());
           Assertions.assertEquals(expectedCategory.getCode(),saveCategory.getCode());
           Assertions.assertEquals(expectedCategory.getLibelle(),saveCategory.getLibelle());
    }

}