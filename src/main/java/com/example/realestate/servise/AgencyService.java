package com.example.realestate.servise;

import com.example.realestate.model.Agency;

import java.util.List;

public interface AgencyService {
    List<Agency> getAll();
    void insert(Agency agency);
    void update(String agencyId,Agency agency);
    void deleteById(String agencyId);
    Agency getById(String agencyId);
}
