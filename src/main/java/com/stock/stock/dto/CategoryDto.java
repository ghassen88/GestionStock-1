package com.stock.stock.dto;


import com.stock.stock.entites.Category;
import lombok.Builder;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;


@Builder
@Data
public class CategoryDto {


    private Integer id;
    private String code;
    private String libelle;
    @JsonIgnore
    private List<ProduitDto> produitDtos;


    //construire l'objet dto
    public static CategoryDto fromEntity(Category category) {

        if (category == null) {
            return null;
            //Todo throw on exception

        }
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .libelle(category.getLibelle())
                //build pour construire un objet de type dto
                .build();

    }


    public static Category toEntity(CategoryDto categoryDto) {

        if (categoryDto == null) {
            return null;
            //Todo throw on exception

        }
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setLibelle(categoryDto.getLibelle());
        return category;


    }

}
