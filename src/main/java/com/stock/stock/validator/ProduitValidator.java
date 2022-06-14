package com.stock.stock.validator;

import com.stock.stock.dto.CategoryDto;
import com.stock.stock.dto.ProduitDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ProduitValidator {






    public static List<String> validate(ProduitDto produitDto) {

        List<String> errors = new ArrayList<>();

        if (produitDto == null || !StringUtils.hasLength(produitDto.getCodeProduit())) {

            errors.add("veuillez rensigner le code de produit");
        }
        return errors;


    }


}
