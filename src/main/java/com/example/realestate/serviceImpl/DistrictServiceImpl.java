package com.example.realestate.serviceImpl;

import com.example.realestate.model.District;
import com.example.realestate.repository.DistrictRepository;
import com.example.realestate.servise.DistrictService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    private DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public List<District> getAll() {
        return this.districtRepository.findAll();
    }

    @Override
    public void insert(District district) {
        this.districtRepository.save(district);
    }

    @Override
    public void update(String districtId, District district) {
        District updateDistrict = this.districtRepository.getById(districtId);
        updateDistrict.setDistrictName(district.getDistrictName());
        updateDistrict.setCity(district.getCity());
        this.districtRepository.save(updateDistrict);
    }

    @Override
    public void deleteById(String districtId) {
        this.districtRepository.deleteById(districtId);
    }

    @Override
    public District getById(String districtId) {
        return this.districtRepository.getById(districtId);
    }
}
