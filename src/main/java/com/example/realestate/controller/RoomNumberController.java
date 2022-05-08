package com.example.realestate.controller;

import com.example.realestate.model.RoomNumber;
import com.example.realestate.serviceImpl.RoomNumberServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("room/number")
public class RoomNumberController {
    private RoomNumberServiceImpl roomNumberService;

    public RoomNumberController(RoomNumberServiceImpl roomNumberService) {
        this.roomNumberService = roomNumberService;
    }

    @GetMapping
    public List<RoomNumber> getAll() {
        return this.roomNumberService.getAll();
    }

    @GetMapping("/{id}")
    public RoomNumber getById(@PathVariable("id") String roomNumberId) {
        return this.roomNumberService.getById(roomNumberId);
    }

    @PostMapping
    public void insert(@RequestBody RoomNumber roomNumber) {
        this.roomNumberService.insert(roomNumber);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String roomNumberId, @RequestBody RoomNumber roomNumber) {
        this.roomNumberService.update(roomNumberId, roomNumber);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String roomNumberId) {
        this.roomNumberService.deleteById(roomNumberId);
    }
}
