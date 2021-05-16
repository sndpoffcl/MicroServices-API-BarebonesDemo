package com.UserService.UserService.repository;

import com.UserService.UserService.entity.User;

public interface UserRepository {
    public User getUserDetails(int id) throws Exception;
    public User saveUserDetails(User user);
    public boolean validateUser(int id);
}
