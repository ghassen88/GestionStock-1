package com.stock.stock.handlers;


import com.stock.stock.exception.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Exception global pour l'application
public class ErrorDto {

    private Integer httpCode;

    private ErrorCodes errorCodes;

    private String message;

    private List<String> errors = new ArrayList<>();

}
