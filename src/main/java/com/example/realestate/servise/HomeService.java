package com.example.realestate.servise;

import com.example.realestate.model.Home;

import java.util.List;

public interface HomeService {
    List<Home> getAll();
    void insert(Home home);
    void update(String homeId,Home home);
    void deleteById(String homeId);
    Home getById(String homeId);
}
