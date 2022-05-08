package com.example.realestate.servise;

import com.example.realestate.model.HomeType;

import java.util.List;

public interface HomeTypeService {
    List<HomeType> getAll();
    void insert(HomeType homeType);
    void update(String homeTypeId,HomeType homeType);
    void deleteById(String homeTypeId);
    HomeType getById(String homeTypeId);
}
