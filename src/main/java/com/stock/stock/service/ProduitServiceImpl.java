package com.stock.stock.service;

import com.stock.stock.entites.Produit;
import com.stock.stock.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProduitServiceImpl {
    @Autowired
    ProduitRepository produitRepository;

    public void Ajouter(Produit produit){
        produitRepository.save(produit);
    }
}
