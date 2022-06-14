package com.stock.stock.validator;


import com.stock.stock.dto.CategoryDto;
import com.stock.stock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public static List<String> validate(FournisseurDto fournisseurDto) {
    List<String> errors = new ArrayList<>();

        if (fournisseurDto == null || !StringUtils.hasLength(fournisseurDto.getNulTel())) {

        errors.add("veuillez rensigner le num de telphone");
    }
        return errors;


}

}
