package com.stock.stock.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fournisseur")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Fournisseur {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String cp;
    private String tel;


    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cp='" + cp + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }


}
