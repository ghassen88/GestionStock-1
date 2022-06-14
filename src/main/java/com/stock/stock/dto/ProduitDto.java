package com.stock.stock.dto;


import com.stock.stock.entites.Produit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import java.math.BigDecimal;

@Data
@Builder

public class ProduitDto {

    private Integer id;
    private String codeProduit;
    private String libelle;
    private BigDecimal prixUnitairehtv;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitairettc;
    @JsonIgnore
    private CategoryDto categoryDto;


    public static ProduitDto fromEntity(Produit produit) {

        if (produit == null) {
            return null;
            //Todo throw on exception

        }
        return ProduitDto.builder()
                .id(produit.getId())
                .libelle(produit.getLibelle())
                .prixUnitairehtv((produit.getPrixUnitairehtv()))
                .tauxTva(produit.getTauxTva())
                .prixUnitairettc(produit.getPrixUnitairettc())
                //build pour construire un objet de type dto
                .build();

    }


    public Produit toEntity(ProduitDto produitDto) {

        if (produitDto == null) {
            return null;
            //Todo throw on exception

        }
        Produit produit = new Produit();
        produit.setId(produitDto.getId());
        produit.setLibelle(produitDto.getLibelle());
        produit.setPrixUnitairehtv(produitDto.getPrixUnitairehtv());
        produit.setTauxTva(produitDto.tauxTva);
        produit.setPrixUnitairettc(produitDto.getPrixUnitairettc());
        return produit;


    }
}
