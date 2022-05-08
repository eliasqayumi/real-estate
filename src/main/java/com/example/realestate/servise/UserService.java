package com.example.realestate.servise;

import com.example.realestate.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    void insert(User user);
    void update(String userId,User user);
    void deleteById(String userId);
    User getById(String userId);
}
