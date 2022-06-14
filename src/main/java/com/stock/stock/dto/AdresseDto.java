package com.stock.stock.dto;


import com.stock.stock.entites.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {


    private Integer id;
    private String adresse1;
    private String adresse2;
    private String codePostale;
    private String pays;

    public AdresseDto fromEntity(Adresse adresse) {

        if (adresse == null) {
            return null;
            //Todo throw on exception

        }
        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                //build pour construire un objet de type dto
                .build();

    }


    public Adresse toEntity(AdresseDto adresseDto) {

        if (adresseDto == null) {
            return null;
            //Todo throw on exception

        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setPays(adresseDto.getPays());
        return adresse;


    }
}
