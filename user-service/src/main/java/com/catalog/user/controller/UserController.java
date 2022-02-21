package com.catalog.user.controller;

import com.catalog.user.entity.User;
import com.catalog.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class UserController {
    @Autowired
    private UserService userService;


    //sign up user
    public User signUpUser (User user) {

         User newUser = null;

         newUser.setPassword(user.getPassword());
         newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());

        return userService.saveUser(newUser);





    }
    //
}
