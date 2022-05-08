package com.example.realestate.controller;

import com.example.realestate.model.Type;
import com.example.realestate.serviceImpl.TypeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("type")
public class TypeController {
    private TypeServiceImpl typeService;

    public TypeController(TypeServiceImpl typeService) {
        this.typeService = typeService;
    }

    @GetMapping
    public List<Type> getAll() {
        return this.typeService.getAll();
    }

    @GetMapping("/{id}")
    public Type getById(@PathVariable("id") String typeId) {
        return this.typeService.getById(typeId);
    }

    @PostMapping
    public void insert(@RequestBody Type type) {
        this.typeService.insert(type);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String typeId, @RequestBody Type type) {
        this.typeService.update(typeId, type);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String typeId) {
        this.typeService.deleteById(typeId);
    }
}
