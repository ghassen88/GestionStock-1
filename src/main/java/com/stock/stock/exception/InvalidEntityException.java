package com.stock.stock.exception;

import java.util.List;

public class InvalidEntityException extends  RuntimeException{



    private ErrorCodes e;

    private List<String> errStrings;


    public InvalidEntityException(ErrorCodes e, List<String> errStrings) {
        this.e = e;
        this.errStrings = errStrings;
    }

    public InvalidEntityException(String message, Throwable cause, ErrorCodes e, List<String> errStrings) {
        super(message, cause);
        this.e = e;
        this.errStrings = errStrings;
    }

    public InvalidEntityException(String message, ErrorCodes e, List<String> errStrings) {
        super(message);
        this.e = e;
        this.errStrings = errStrings;
    }

    public InvalidEntityException(Throwable cause, ErrorCodes e) {
        super(cause);
        this.e = e;
    }

    public InvalidEntityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCodes e, List<String> errStrings) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.e = e;
        this.errStrings = errStrings;
    }
}
