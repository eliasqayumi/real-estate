package com.example.realestate.controller;

import com.example.realestate.model.HomeType;
import com.example.realestate.serviceImpl.HomeTypeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("home/type")
public class HomeTypeController {
    private HomeTypeServiceImpl homeTypeService;

    public HomeTypeController(HomeTypeServiceImpl homeTypeService) {
        this.homeTypeService = homeTypeService;
    }

    @GetMapping
    public List<HomeType> getAll() {
        return this.homeTypeService.getAll();
    }

    @GetMapping("/{id}")
    public HomeType getById(@PathVariable("id") String homeTypeId) {
        return this.homeTypeService.getById(homeTypeId);
    }

    @PostMapping
    public void insert(@RequestBody HomeType homeType) {
        this.homeTypeService.insert(homeType);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String homeTypeId, @RequestBody HomeType homeType) {
        this.homeTypeService.update(homeTypeId, homeType);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String homeTypeId) {
        this.homeTypeService.deleteById(homeTypeId);
    }
}
