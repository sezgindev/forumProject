package com.FirstSpringBootProject.auth.service;

import com.FirstSpringBootProject.auth.model.User;
import com.FirstSpringBootProject.auth.repository.RoleRepository;
import com.FirstSpringBootProject.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<String> getUsername() {
        List<String> username = new ArrayList<>();
        Iterator iterator = getUsers().iterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            username.add(user.getUsername());
        }
        return username;
    }



    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

  @Override
    public void deleteByUsername(String username){
      deleteByUsername(username);
  }




}