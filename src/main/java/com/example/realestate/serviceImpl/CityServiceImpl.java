package com.example.realestate.serviceImpl;

import com.example.realestate.model.City;
import com.example.realestate.repository.CityRepository;
import com.example.realestate.servise.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getAll() {
        return this.cityRepository.findAll();
    }

    @Override
    public void insert(City city) {
        this.cityRepository.save(city);
    }

    @Override
    public void update(String cityId, City city) {
        City updateCity=this.cityRepository.getById(cityId);
        updateCity.setCityName(city.getCityName());
        this.cityRepository.save(updateCity);
    }

    @Override
    public void deleteById(String cityId) {
        this.cityRepository.deleteById(cityId);
    }

    @Override
    public City getById(String cityId) {
        return this.cityRepository.getById(cityId);
    }
}
