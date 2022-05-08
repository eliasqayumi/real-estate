package com.example.realestate.serviceImpl;

import com.example.realestate.model.User;
import com.example.realestate.repository.UserRepository;
import com.example.realestate.servise.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void insert(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void update(String userId, User user) {
        User updateUser=this.userRepository.getById(userId);
        updateUser.setAgency(user.getAgency());
        updateUser.setEmail(user.getEmail());
        updateUser.setEmployees(user.getEmployees());
        updateUser.setPassword(user.getPassword());
        updateUser.setPhoneNumber(user.getPhoneNumber());
        updateUser.setPosition(user.getPosition());
        this.userRepository.save(updateUser);
    }

    @Override
    public void deleteById(String userId) {
        this.userRepository.deleteById(userId);
    }

    @Override
    public User getById(String userId) {
        return this.userRepository.getById(userId);
    }
}
