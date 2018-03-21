package com.example.demo.error;

import org.springframework.http.HttpStatus;

public class CustomErroType {

    private String errorMessage;

    public CustomErroType(String errorMessage, HttpStatus notFound){
        this.errorMessage = errorMessage;
    }

    public CustomErroType(String student_not_found) {
    }

    public String getErroMessage() {
        return errorMessage;
    }
}
