package com.FirstSpringBootProject.auth.service;

import com.FirstSpringBootProject.auth.model.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void deleteByUsername(String username);

    User findByUsername(String username);
    Iterable<User> getUsers();
    List<String> getUsername();
}