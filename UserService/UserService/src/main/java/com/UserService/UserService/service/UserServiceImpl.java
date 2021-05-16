package com.UserService.UserService.service;

import com.UserService.UserService.entity.User;
import com.UserService.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserDetails(int userId) throws Exception {
        return userRepository.getUserDetails(userId);
    }

    @Override
    public User saveUserDetails(User user) {
        return userRepository.saveUserDetails(user);
    }

    @Override
    public boolean validateUser(int id) {
        return userRepository.validateUser(id);
    }
}
