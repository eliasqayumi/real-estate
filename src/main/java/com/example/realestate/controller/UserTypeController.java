package com.example.realestate.controller;

import com.example.realestate.model.UserType;
import com.example.realestate.serviceImpl.UserTypeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user/type")
public class UserTypeController {
    private UserTypeServiceImpl userTypeService;

    public UserTypeController(UserTypeServiceImpl userTypeService) {
        this.userTypeService = userTypeService;
    }

    @GetMapping
    public List<UserType> getAll() {
        return this.userTypeService.getAll();
    }

    @GetMapping("/{id}")
    public UserType getById(@PathVariable("id") String userTypeId) {
        return this.userTypeService.getById(userTypeId);
    }

    @PostMapping
    public void insert(@RequestBody UserType userType) {
        this.userTypeService.insert(userType);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String userTypeId, @RequestBody UserType userType) {
        this.userTypeService.update(userTypeId, userType);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String userTypeId) {
        this.userTypeService.deleteById(userTypeId);
    }
}
