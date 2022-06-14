

package com.stock.stock.service.impl;


import com.stock.stock.dto.ProduitDto;
import com.stock.stock.entites.Produit;
import com.stock.stock.exception.EntityNotFoundException;
import com.stock.stock.exception.ErrorCodes;
import com.stock.stock.exception.InvalidEntityException;
import com.stock.stock.service.ProduitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.stock.stock.repositories.ProduitRepository;
import com.stock.stock.validator.ProduitValidator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service("produitServiceImpl1")
@Slf4j
public class ProduitServiceImpl implements ProduitService {

@Autowired

ProduitRepository produitRepository;
//    private ProduitRepository produitRepository;
//
//    //injection par constructor
//    public ProduitServiceImpl(ProduitRepository produitRepository) {
//
//        this.produitRepository = produitRepository;
//    }


    @Override
    public ProduitDto save(ProduitDto produitDto) {

        List<String> errors = ProduitValidator.validate(produitDto);
        if (!errors.isEmpty()) {
            log.error("article is not valid", produitDto);
            throw new InvalidEntityException("le produit n'est pas valide", ErrorCodes.PRODUIT_NOT_VALID, errors);
        }
        return ProduitDto.fromEntity(produitRepository.save(produitDto.toEntity(produitDto)));
    }


    @Override
    public ProduitDto findById(Integer id) {

        if (id == null) {
            log.error("produit id is null");

        }

        Optional<Produit> produit = produitRepository.findById(id);
        return Optional.of(ProduitDto.fromEntity(produit.get())).orElseThrow(() -> new EntityNotFoundException
                ("aucun article trouvé", ErrorCodes.PRODUIT_NOT_FOUND));
    }

    @Override
    public ProduitDto findByCodeProduit(String codeProduit) {

        //StringUtils
        if (!StringUtils.hasLength(codeProduit)) {
            log.error("produit code is null");

        }

        Optional<Produit> produit = produitRepository.findProduirByCodeProduit(codeProduit);
        return Optional.of(ProduitDto.fromEntity(produit.get())).orElseThrow(() -> new EntityNotFoundException
                ("aucun article trouvé", ErrorCodes.PRODUIT_NOT_FOUND));
    }

    @Override
    public List<ProduitDto> finAll() {
        return produitRepository.findAll().stream()
                //methode refernce
                .map(ProduitDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if (id == null) {
            log.error("produit id is null");
            return;

        }
        produitRepository.deleteById(id);

    }
}
