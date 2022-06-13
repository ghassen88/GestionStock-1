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
    private Long id;
    private Integer stock;
    private Integer libelle;
    private float prix;
    private String photo;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
