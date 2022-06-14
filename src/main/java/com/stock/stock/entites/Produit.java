package com.stock.stock.entites;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produit")
public class Produit extends AbstractEntity {

    @Column(name = "codeProduit")
    private String codeProduit;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "prixUnitairehtv")
    private BigDecimal prixUnitairehtv;
    @Column(name = "tauxTva")
    private BigDecimal tauxTva;
    @Column(name = "prixUnitairettc")
    private BigDecimal prixUnitairettc;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;

}
