package com.stock.stock.dto;


import com.stock.stock.entites.Adresse;
import com.stock.stock.entites.Category;
import com.stock.stock.entites.Fournisseur;
import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class FournisseurDto {

    private Integer id;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private String photo;
    private String mail;
    private String nulTel;


    public static FournisseurDto fromEntity(Fournisseur fournisseur) {

        if (fournisseur == null) {
            return null;
            //Todo throw on exception

        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adresse(fournisseur.getAdresse())
                .mail(fournisseur.getMail())
                .photo(fournisseur.getPhoto())
                .nulTel(fournisseur.getNulTel())
                //build pour construire un objet de type dto
                .build();

    }


    public static Fournisseur toEntity(FournisseurDto fournisseurDto) {

        if (fournisseurDto == null) {
            return null;
            //Todo throw on exception

        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setAdresse(fournisseurDto.getAdresse());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setNulTel(fournisseurDto.getNulTel());
        return fournisseur;


    }
}
