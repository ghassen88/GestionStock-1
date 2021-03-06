package com.stock.stock.entites;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {


    private Integer id;
    private String libelle;


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
