package com.stock.stock.controller.api;


import com.stock.stock.dto.ProduitDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stock.stock.utils.Constants.APP_ROOT;

public interface CategoryApi {
    @PostMapping(value = APP_ROOT + "/categories/create", produces = MediaType.APPLICATION_JSON_VALUE)
    ProduitDto save(@RequestBody ProduitDto produitDto);


    @GetMapping(value = APP_ROOT + "/categories/{idCategorie}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ProduitDto findById(@PathVariable Integer id);



    @GetMapping(value = APP_ROOT + "/categories/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProduitDto> finAll();

    @DeleteMapping(value = APP_ROOT + "/categories/{id}")
    void delete(@PathVariable Integer id);
}
