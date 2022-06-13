package com.stock.stock.service;

import com.stock.stock.entites.Fournisseur;
import com.stock.stock.entites.Produit;
import com.stock.stock.repositories.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FournisseurService {
    @Autowired
    FournisseurRepository fournisseurRepository;

    public void Ajouter(Fournisseur fournisseur){
        fournisseurRepository.save(fournisseur);
    }
}
