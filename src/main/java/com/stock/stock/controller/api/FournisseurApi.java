package com.stock.stock.controller.api;


import com.stock.stock.dto.FournisseurDto;
import com.stock.stock.dto.ProduitDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stock.stock.utils.Constants.APP_ROOT;

public interface FournisseurApi {

    @PostMapping(value = APP_ROOT + "/fournisseurs/create", produces = MediaType.APPLICATION_JSON_VALUE)
    FournisseurDto save(@RequestBody FournisseurDto fournisseurDto);


    @GetMapping(value = APP_ROOT + "/fournisseurs/{idfournisseur}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    FournisseurDto findById(@PathVariable Integer id);



    @GetMapping(value = APP_ROOT + "/fournisseurs/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    List<FournisseurDto> finAll();

    @DeleteMapping(value = APP_ROOT + "/fournisseurs/{id}")
    void delete(@PathVariable Integer id);
}

