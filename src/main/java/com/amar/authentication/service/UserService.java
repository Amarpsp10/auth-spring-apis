package com.amar.authentication.service;

import com.amar.authentication.models.Role;
import com.amar.authentication.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRollToUser(String username, String role);
    User getUser(String username);
    List<User> getUsers();
}
