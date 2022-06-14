package com.stock.stock.validator;


import com.stock.stock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.*;

public class CategoryValidator {

    //methode static
    public static List<String> validate(CategoryDto categoryDto) {

        List<String> errors = new ArrayList<>();

        if (categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())) {

            errors.add("veuillez rensigner le code de la catégorie");
        }
        return errors;


    }

}
