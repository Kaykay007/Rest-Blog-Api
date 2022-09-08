package com.korede.restfulblog.dto;

import lombok.Data;

import javax.persistence.Column;
@Data
public class UserDto {
    private  int id;
    private String name;
    private String email;
    private String role;
    private  String password;

}
