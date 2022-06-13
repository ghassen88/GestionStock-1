package com.stock.stock.repositories;

import com.stock.stock.entites.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
}
