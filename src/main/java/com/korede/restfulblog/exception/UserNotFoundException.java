package com.korede.restfulblog.exception;

import lombok.Getter;

@Getter
public class UserNotFoundException extends RuntimeException {
    private String message;
    public UserNotFoundException(String message){
        this.message=message;
    }
}