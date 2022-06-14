package com.stock.stock.service;


import com.stock.stock.dto.FournisseurDto;

import java.util.List;

public interface FournisseurService {


    FournisseurDto save(FournisseurDto fournisseurDto);

    FournisseurDto findById(Integer id);


    List<FournisseurDto> finAll();

    void delete(Integer id);
}
