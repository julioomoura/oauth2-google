package com.julio.oauth2google.services;

import com.julio.oauth2google.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User createUser(User user);
    public User findUserById(Long id);
    public Iterable<User>findAllUsers();
    public User updateUser(Long id, String name, String email);
    public void deleteUserById(Long id);
}
