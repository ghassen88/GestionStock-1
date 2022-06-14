package com.stock.stock.service;

import com.stock.stock.dto.ProduitDto;

import java.util.List;

public interface ProduitService {


    ProduitDto save(ProduitDto produitDto);

    ProduitDto findById(Integer id);

    ProduitDto findByCodeProduit(String codeProduit);

    List<ProduitDto> finAll();

    void delete(Integer id);
}
