package com.stock.stock.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produit {
    @Id
    private Long id;
    private Integer stock;
    private Integer libelle;
    private float prix;
    private String photo;


}
