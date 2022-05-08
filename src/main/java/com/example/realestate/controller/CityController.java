package com.example.realestate.controller;

import com.example.realestate.model.Agency;
import com.example.realestate.model.City;
import com.example.realestate.serviceImpl.CityServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("city")
public class CityController {
    private CityServiceImpl cityService;

    public CityController(CityServiceImpl cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<City> getAll() {
        return this.cityService.getAll();
    }

    @GetMapping("/{id}")
    public City getById(@PathVariable("id") String cityId) {
        return this.cityService.getById(cityId);
    }

    @PostMapping
    public void insert(City city) {
        this.cityService.insert(city);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String cityId, @RequestBody City city) {
        this.cityService.update(cityId, city);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")String cityId){
        this.cityService.deleteById(cityId);
    }

}
