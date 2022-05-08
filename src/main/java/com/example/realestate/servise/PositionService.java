package com.example.realestate.servise;

import com.example.realestate.model.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAll();
    void insert(Position position);
    void update(String positionId,Position position);
    void deleteById(String positionId);
    Position getById(String positionId);
}
