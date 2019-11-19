package com.julio.oauth2google.services.impl;

import com.julio.oauth2google.models.User;
import com.julio.oauth2google.repositories.UserRepository;
import com.julio.oauth2google.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public Iterable<User> findAllUsers() {
        return findAllUsers();
    }

    @Override
    public User updateUser(Long id, String name, String email) {
        User user = findUserById(id);
        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
