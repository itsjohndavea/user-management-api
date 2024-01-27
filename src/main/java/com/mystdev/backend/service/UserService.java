package com.mystdev.backend.service;

import java.util.List;

import com.mystdev.backend.model.User;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUser(Long id);

    User updateUser(Long id, User user);

}