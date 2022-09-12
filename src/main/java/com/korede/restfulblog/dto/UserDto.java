package com.korede.restfulblog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
//    private  int id;
    private String name;
    private String email;
    private String role;
    private  String password;

}
