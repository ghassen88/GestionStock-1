package com.stock.stock.repositories;

import com.stock.stock.entites.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {

    Optional<Produit> findProduirByCodeProduit(String codeProduit);


    //springdatajpa

    //requete jpql
//    @Query("select a from produit where codeProduit =:codeProduit AND libelle=: libelle" )
//    List<Produit> findProduitBycustomQuery(@Param("codeProduit") String c,@Param("libelle") String l);

    //requete native

//    @Query(value = "select a from produit where codeProduit =:codeProduit AND libelle=: libelle",nativeQuery = true )
//    List<Produit> findProduitBycustomQuery(@Param("codeProduit") String c,@Param("libelle") String l);


List<Produit> findByCodeProduitIgnoreCaseandLibelleIgnoreCase(String codeProduit , String libelle);

}
