package com.example.realestate.servise;

import com.example.realestate.model.Type;

import java.util.List;

public interface TypeService {
    List<Type> getAll();
    void insert(Type type);
    void update(String typeId,Type type);
    void deleteById(String typeId);
    Type getById(String typeId);
}
