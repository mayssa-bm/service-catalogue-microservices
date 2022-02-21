package com.catalog.user.service;


import com.catalog.user.entity.User;
import com.catalog.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public User saveUser(User newUser) {
        return  userRepository.save(newUser);
    }
}
