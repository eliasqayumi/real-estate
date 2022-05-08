package com.example.realestate.controller;

import com.example.realestate.model.Neighbourhood;
import com.example.realestate.serviceImpl.NeighbourhoodServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("neighbourhood")
public class NeighbourhoodController {
    private NeighbourhoodServiceImpl neighbourhoodService;

    public NeighbourhoodController(NeighbourhoodServiceImpl neighbourhoodService) {
        this.neighbourhoodService = neighbourhoodService;
    }

    @GetMapping
    public List<Neighbourhood> getAll() {
        return this.neighbourhoodService.getAll();
    }

    @GetMapping("/{id}")
    public Neighbourhood getById(@PathVariable("id") String neighbourhoodId) {
        return this.neighbourhoodService.getById(neighbourhoodId);
    }

    @PostMapping
    public void insert(@RequestBody Neighbourhood neighbourhood) {
        this.neighbourhoodService.insert(neighbourhood);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String neighbourhoodId, @RequestBody Neighbourhood neighbourhood) {
        this.neighbourhoodService.update(neighbourhoodId, neighbourhood);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String neighbourhoodId) {
        this.neighbourhoodService.deleteById(neighbourhoodId);
    }
}
