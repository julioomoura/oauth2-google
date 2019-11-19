package com.julio.oauth2google.controllers;

import com.julio.oauth2google.models.User;
import com.julio.oauth2google.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public @ResponseBody Iterable<User> getUsers() {
        return userService.findAllUsers();
    }
}
