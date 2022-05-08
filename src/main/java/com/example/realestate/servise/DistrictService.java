package com.example.realestate.servise;

import com.example.realestate.model.District;

import java.util.List;

public interface DistrictService {
    List<District> getAll();
    void insert(District district);
    void update(String districtId,District district);
    void deleteById(String districtId);
    District getById(String districtId);
}
