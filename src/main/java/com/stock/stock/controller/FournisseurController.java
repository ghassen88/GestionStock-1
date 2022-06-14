package com.stock.stock.controller;


import com.stock.stock.controller.api.FournisseurApi;
import com.stock.stock.dto.FournisseurDto;
import com.stock.stock.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FournisseurController implements FournisseurApi {

    @Autowired
    FournisseurService fournisseurService;

    @Override
    public FournisseurDto save(FournisseurDto fournisseurDto) {
        return fournisseurService.save(fournisseurDto);
    }

    @Override
    public FournisseurDto findById(Integer id) {
        return fournisseurService.findById(id);
    }

    @Override
    public List<FournisseurDto> finAll() {
        return fournisseurService.finAll();
    }

    @Override
    public void delete(Integer id) {
        fournisseurService.delete(id);
    }
}
