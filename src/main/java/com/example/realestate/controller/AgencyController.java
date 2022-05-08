package com.example.realestate.controller;

import com.example.realestate.model.Agency;
import com.example.realestate.serviceImpl.AgencyServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agency")
public class AgencyController {
    private AgencyServiceImpl agencyService;

    public AgencyController(AgencyServiceImpl agencyService) {
        this.agencyService = agencyService;
    }

    @GetMapping
    public List<Agency> getAll() {
        return this.agencyService.getAll();
    }

    @GetMapping("/{id}")
    public Agency getById(@PathVariable("id") String agencyId) {
        return this.agencyService.getById(agencyId);
    }

    @PostMapping
    public void insert(@RequestBody Agency agency) {
        this.agencyService.insert(agency);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String agencyId, @RequestBody Agency agency) {
        this.agencyService.update(agencyId, agency);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String agencyId) {
        this.agencyService.deleteById(agencyId);
    }


}
