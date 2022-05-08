package com.example.realestate.serviceImpl;

import com.example.realestate.model.HomeType;
import com.example.realestate.repository.HomeTypeRepository;
import com.example.realestate.servise.HomeTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeTypeServiceImpl implements HomeTypeService {
    private HomeTypeRepository homeTypeRepository;

    public HomeTypeServiceImpl(HomeTypeRepository homeTypeRepository) {
        this.homeTypeRepository = homeTypeRepository;
    }

    @Override
    public List<HomeType> getAll() {
        return this.homeTypeRepository.findAll();
    }

    @Override
    public void insert(HomeType homeType) {
        this.homeTypeRepository.save(homeType);
    }

    @Override
    public void update(String homeTypeId, HomeType homeType) {
        HomeType updateHomeTYpe = this.homeTypeRepository.getById(homeTypeId);
        updateHomeTYpe.setHomeTypeName(homeType.getHomeTypeName());
        this.homeTypeRepository.save(homeType);
    }

    @Override
    public void deleteById(String homeTypeId) {
        this.homeTypeRepository.deleteById(homeTypeId);
    }

    @Override
    public HomeType getById(String homeTypeId) {
        return this.homeTypeRepository.getById(homeTypeId);
    }
}
