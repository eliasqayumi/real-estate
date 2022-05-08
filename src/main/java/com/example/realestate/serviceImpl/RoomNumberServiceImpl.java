package com.example.realestate.serviceImpl;

import com.example.realestate.model.RoomNumber;
import com.example.realestate.repository.RoomNumberRepository;
import com.example.realestate.servise.RoomNumberService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomNumberServiceImpl implements RoomNumberService {
    private RoomNumberRepository roomNumberRepository;

    public RoomNumberServiceImpl(RoomNumberRepository roomNumberRepository) {
        this.roomNumberRepository = roomNumberRepository;
    }

    @Override
    public List<RoomNumber> getAll() {
        return this.roomNumberRepository.findAll();
    }

    @Override
    public void insert(RoomNumber roomNumber) {
        this.roomNumberRepository.save(roomNumber);
    }

    @Override
    public void update(String roomNumberId, RoomNumber roomNumber) {
        RoomNumber updateRoomNumber=this.roomNumberRepository.getById(roomNumberId);
        updateRoomNumber.setRoomNumber(roomNumber.getRoomNumber());
        this.roomNumberRepository.save(updateRoomNumber);
    }

    @Override
    public void deleteById(String roomNumberId) {
        this.roomNumberRepository.deleteById(roomNumberId);
    }

    @Override
    public RoomNumber getById(String roomNumberId) {
        return this.roomNumberRepository.getById(roomNumberId);
    }
}
