package com.example.realestate.controller;

import com.example.realestate.model.Position;
import com.example.realestate.serviceImpl.PositionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("position")
public class PositionController {
    private PositionServiceImpl positionService;

    public PositionController(PositionServiceImpl positionService) {
        this.positionService = positionService;
    }

    @GetMapping
    public List<Position> getAll() {
        return this.positionService.getAll();
    }

    @GetMapping("/{id}")
    public Position getById(@PathVariable("id") String positionId) {
        return this.positionService.getById(positionId);
    }

    @PostMapping
    public void insert(@RequestBody Position position) {
        this.positionService.insert(position);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String positionId, @RequestBody Position position) {
        this.positionService.update(positionId, position);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String positionId) {
        this.positionService.deleteById(positionId);
    }
}
