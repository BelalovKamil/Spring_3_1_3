package com.example.javascript.service;

import com.example.javascript.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();

    User add(User user);

    void delete(int id);

    User update(User user);

    User getById(int id);
}
