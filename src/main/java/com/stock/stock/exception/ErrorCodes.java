package com.stock.stock.exception;

public enum ErrorCodes {

    PRODUIT_NOT_FOUND(1000),
    PRODUIT_NOT_VALID(1001),
    CATEGORY_NOT_FOUND(2000),
    FOURNISSEUR_NOT_FOUND(3000);

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
