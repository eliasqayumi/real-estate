package com.example.realestate.controller;

import com.example.realestate.model.District;
import com.example.realestate.serviceImpl.DistrictServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("district")
public class DistrictController {
    private DistrictServiceImpl districtService;

    public DistrictController(DistrictServiceImpl districtService) {
        this.districtService = districtService;
    }

    @GetMapping
    public List<District> getAll() {
        return this.districtService.getAll();
    }

    @GetMapping("/{id}")
    public District getById(@PathVariable("id") String districtId) {
        return this.districtService.getById(districtId);
    }

    @PostMapping
    public void insert(@RequestBody District district) {
        this.districtService.insert(district);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String districtId, @RequestBody District district) {
        this.districtService.update(districtId, district);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String districtId) {
        this.districtService.deleteById(districtId);
    }
}
