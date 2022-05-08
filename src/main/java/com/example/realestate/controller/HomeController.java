package com.example.realestate.controller;

import com.example.realestate.model.Home;
import com.example.realestate.serviceImpl.HomeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("home")
public class HomeController {
    private HomeServiceImpl homeService;

    public HomeController(HomeServiceImpl homeService) {
        this.homeService = homeService;
    }

    @GetMapping
    public List<Home> getAll() {
        return this.homeService.getAll();
    }

    @GetMapping("/{id}")
    public Home getById(@PathVariable("id") String homeId) {
        return this.homeService.getById(homeId);
    }

    @PostMapping
    public void insert(@RequestBody Home home) {
        this.homeService.insert(home);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String homeId, @RequestBody Home home) {
        this.homeService.update(homeId, home);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String homeId) {
        this.homeService.deleteById(homeId);
    }
}
