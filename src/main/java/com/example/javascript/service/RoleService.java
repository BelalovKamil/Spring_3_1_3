package com.example.javascript.service;

import com.example.javascript.model.Role;

import java.util.Set;

public interface RoleService {
    void save(Role role);

    Set<Role> getAllRoles();
}
