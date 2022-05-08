package com.example.realestate.servise;

import com.example.realestate.model.UserType;

import java.util.List;

public interface UserTypeService {
    List<UserType> getAll();
    void insert(UserType userType);
    void update(String userTypeId,UserType userType);
    void deleteById(String userTypeId);
    UserType getById(String userTypeId);
}
