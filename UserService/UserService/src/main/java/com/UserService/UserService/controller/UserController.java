package com.UserService.UserService.controller;

import com.UserService.UserService.entity.User;
import com.UserService.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUserDetails(@PathVariable("id") int id) throws Exception {
        User savedUser = userService.getUserDetails(id);
        return savedUser;
    }

    @PostMapping("/user")
    public User saveUserDetails(@RequestBody User user){
        User newSavedUser = userService.saveUserDetails(user);
        return newSavedUser;
    }

    @GetMapping("/validate/{id}")
    public boolean validateUser(@PathVariable("id") int id){
        boolean validation = userService.validateUser(id);
        return validation;
    }
}
