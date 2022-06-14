package com.stock.stock.service.impl;


import com.stock.stock.dto.FournisseurDto;
import com.stock.stock.entites.Fournisseur;
import com.stock.stock.exception.EntityNotFoundException;
import com.stock.stock.exception.ErrorCodes;
import com.stock.stock.exception.InvalidEntityException;
import com.stock.stock.service.FournisseurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stock.stock.repositories.FournisseurRepository;
import com.stock.stock.validator.FournisseurValidator;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FournisseurServiceImpl implements FournisseurService {


    @Autowired
    FournisseurRepository fournisseurRepository;


    @Override
    public FournisseurDto save(FournisseurDto fournisseurDto) {
        List<String> errors = FournisseurValidator.validate(fournisseurDto);
        if (!errors.isEmpty()) {
            log.error("fourn is not valid", fournisseurDto);
            throw new InvalidEntityException("le fournisseur n'est pas valide", ErrorCodes.PRODUIT_NOT_VALID, errors);
        }
        return FournisseurDto.fromEntity(fournisseurRepository.save(FournisseurDto.toEntity(fournisseurDto)));
    }

    @Override
    public FournisseurDto findById(Integer id) {
        if (id == null) {
            log.error("produit id is null");

        }

        Optional<Fournisseur> fournisseur = fournisseurRepository.findById(id);
        return Optional.of(FournisseurDto.fromEntity(fournisseur.get())).orElseThrow(() -> new EntityNotFoundException
                ("aucun fournisseur trouvé", ErrorCodes.CATEGORY_NOT_FOUND));
    }

    @Override
    public List<FournisseurDto> finAll() {

        return fournisseurRepository.findAll().stream()
                //methode refernce
                .map(FournisseurDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if (id == null) {
            log.error("produit id is null");
            return;

        }
        fournisseurRepository.deleteById(id);
    }
}
