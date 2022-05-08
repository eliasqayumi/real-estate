package com.example.realestate.servise;


import com.example.realestate.model.City;

import java.util.List;

public interface CityService {
    List<City> getAll();
    void insert(City city);
    void update(String cityId,City city);
    void deleteById(String cityId);
    City getById(String cityId);
}