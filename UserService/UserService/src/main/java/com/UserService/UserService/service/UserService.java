package com.UserService.UserService.service;

import com.UserService.UserService.entity.User;

public interface UserService {
    User getUserDetails(int userId) throws Exception;
    User saveUserDetails(User user);
    boolean validateUser(int id);
}
