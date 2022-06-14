package com.stock.stock.entites;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "categorie")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Category extends AbstractEntity {


    @Column(name = "code")
    private String code;

    @Column(name = "libelle")
    private String libelle;


    @OneToMany(mappedBy = "category")
    private List<Produit> produits;


}
