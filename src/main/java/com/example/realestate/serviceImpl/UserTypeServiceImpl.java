package com.example.realestate.serviceImpl;

import com.example.realestate.model.UserType;
import com.example.realestate.repository.UserTypeRepository;
import com.example.realestate.servise.UserTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {
    private UserTypeRepository userTypeRepository;

    public UserTypeServiceImpl(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public List<UserType> getAll() {
        return this.userTypeRepository.findAll();
    }

    @Override
    public void insert(UserType userType) {
        this.userTypeRepository.save(userType);
    }

    @Override
    public void update(String userTypeId, UserType userType) {
        UserType updateUserType = this.userTypeRepository.getById(userTypeId);
        updateUserType.setUserType(userType.getUserType());
        this.userTypeRepository.save(updateUserType);
    }

    @Override
    public void deleteById(String userTypeId) {
        this.userTypeRepository.deleteById(userTypeId);
    }

    @Override
    public UserType getById(String userTypeId) {
        return this.userTypeRepository.getById(userTypeId);
    }
}
