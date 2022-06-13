package com.stock.stock.repositories;

import com.stock.stock.entites.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer> {
}
