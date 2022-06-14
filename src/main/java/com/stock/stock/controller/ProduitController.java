package com.stock.stock.controller;


import com.stock.stock.controller.api.ProduitApi;
import com.stock.stock.dto.ProduitDto;
import com.stock.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Qualifier("produitServiceImpl1")
public class ProduitController implements ProduitApi {

    @Autowired
    ProduitService produitService;

    @Override
    public ProduitDto save(ProduitDto produitDto) {
        return produitService.save(produitDto);
    }

    @Override
    public ProduitDto findById(Integer id) {
        return produitService.findById(id);
    }

    @Override
    public ProduitDto findByCodeProduit(String codeProduit) {
        return produitService.findByCodeProduit(codeProduit);
    }

    @Override
    public List<ProduitDto> finAll() {
        return produitService.finAll();
    }

    @Override
    public void delete(Integer id) {
        produitService.delete(id);

    }
}
