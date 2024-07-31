package com.hexaware.employee.dto;

import org.springframework.http.HttpStatus;

public class CustomException {
    private String message;
    private HttpStatus status;
    public CustomException(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}