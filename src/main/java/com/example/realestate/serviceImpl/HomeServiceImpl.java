package com.example.realestate.serviceImpl;

import com.example.realestate.model.Home;
import com.example.realestate.repository.HomeRepository;
import com.example.realestate.servise.HomeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomeServiceImpl implements HomeService {
    private HomeRepository homeRepository;

    public HomeServiceImpl(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @Override
    public List<Home> getAll() {
        return this.homeRepository.findAll();
    }

    @Override
    public void insert(Home home) {
        this.homeRepository.save(home);
    }

    @Override
    public void update(String homeId, Home home) {
        Home updateHome =this.homeRepository.getById(homeId);
        updateHome.setHomeType(home.getHomeType());
        updateHome.setCity(home.getCity());
        updateHome.setDistrict(home.getDistrict());
        updateHome.setNeighbourhood(home.getNeighbourhood());
        updateHome.setAddress(home.getAddress());
        updateHome.setCurrency(home.getCurrency());
        updateHome.setPrice(home.getPrice());
        updateHome.setRoomNumber(home.getRoomNumber());
        updateHome.setType(home.getType());
        updateHome.setUser(home.getUser());
        this.homeRepository.save(updateHome);
    }

    @Override
    public void deleteById(String homeId) {
        this.homeRepository.deleteById(homeId);
    }

    @Override
    public Home getById(String homeId) {
        return this.homeRepository.getById(homeId);
    }
}
