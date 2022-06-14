package com.stock.stock.handlers;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
}
