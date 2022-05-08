package com.example.realestate.servise;

import com.example.realestate.model.Neighbourhood;

import java.util.List;

public interface NeighbourhoodService {
    List<Neighbourhood> getAll();
    void insert(Neighbourhood neighbourhood);
    void update(String neighbourhoodId, Neighbourhood neighbourhood);
    void deleteById(String neighbourhoodId);
    Neighbourhood getById(String neighbourhoodId);
}
