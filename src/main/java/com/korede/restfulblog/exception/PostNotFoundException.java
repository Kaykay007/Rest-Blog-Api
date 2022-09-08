package com.korede.restfulblog.exception;

import lombok.Getter;

@Getter
public class PostNotFoundException extends RuntimeException {
    private String message;
    public PostNotFoundException(String message){
        this.message=message;
    }
}
