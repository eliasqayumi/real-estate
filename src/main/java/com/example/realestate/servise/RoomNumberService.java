package com.example.realestate.servise;

import com.example.realestate.model.RoomNumber;

import java.util.List;

public interface RoomNumberService {
    List<RoomNumber> getAll();
    void insert(RoomNumber roomNumber);
    void update(String roomNumberId,RoomNumber roomNumber);
    void deleteById(String roomNumberId);
    RoomNumber getById(String roomNumberId);
}
