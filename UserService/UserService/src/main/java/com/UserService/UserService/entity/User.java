package com.UserService.UserService.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String password;
    private String username;
    private String userAddress;
    private int userAge;
}
