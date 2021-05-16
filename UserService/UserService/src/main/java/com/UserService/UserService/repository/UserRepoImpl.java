package com.UserService.UserService.repository;

import com.UserService.UserService.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepoImpl implements UserRepository {

    private static HashMap<Integer, User> userData = new HashMap<>();

    @Override
    public User getUserDetails(int id) throws Exception {
        User savedUser = userData.get(id);
        if(savedUser == null){
            throw new Exception("User does not exist");
        }else{
            return savedUser;
        }
    }

    @Override
    public User saveUserDetails(User user) {
        userData.put(user.getId(), user);
        return user;
    }

    @Override
    public boolean validateUser(int id) {
        boolean userExists = userData.containsKey(id);
        return userExists;
    }
}
