package com.example.realestate.controller;

import com.example.realestate.model.User;
import com.example.realestate.serviceImpl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") String userId) {
        return this.userService.getById(userId);
    }

    @PostMapping
    public void insert(@RequestBody User user) {
        this.userService.insert(user);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String userId, @RequestBody User user) {
        this.userService.update(userId, user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String userId) {
        this.userService.deleteById(userId);
    }
}
