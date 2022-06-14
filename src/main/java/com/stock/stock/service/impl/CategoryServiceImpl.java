package com.stock.stock.service.impl;

import com.stock.stock.dto.CategoryDto;
import com.stock.stock.entites.Category;
import com.stock.stock.exception.EntityNotFoundException;
import com.stock.stock.exception.ErrorCodes;
import com.stock.stock.exception.InvalidEntityException;
import com.stock.stock.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.stock.stock.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.stock.stock.validator.CategoryValidator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        List<String> errors = CategoryValidator.validate(categoryDto);
        if (!errors.isEmpty()) {
            log.error("article is not valid", categoryDto);
            throw new InvalidEntityException("le produit n'est pas valide", ErrorCodes.PRODUIT_NOT_VALID, errors);
        }
        return CategoryDto.fromEntity(categoryRepository.save(CategoryDto.toEntity(categoryDto)));
    }

    @Override
    public CategoryDto findById(Integer id) {

        if (id == null) {
            log.error("produit id is null");

        }

        Optional<Category> category = categoryRepository.findById(id);
        return Optional.of(CategoryDto.fromEntity(category.get())).orElseThrow(() -> new EntityNotFoundException
                ("aucun article trouvé", ErrorCodes.CATEGORY_NOT_FOUND));
    }

    @Override
    public List<CategoryDto> finAll() {
        return categoryRepository.findAll().stream()
                //methode refernce
                .map(CategoryDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if (id == null) {
            log.error("produit id is null");
            return;

        }
        categoryRepository.deleteById(id);
    }
}
