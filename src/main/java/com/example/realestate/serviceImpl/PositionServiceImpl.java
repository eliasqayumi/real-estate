package com.example.realestate.serviceImpl;

import com.example.realestate.model.Position;
import com.example.realestate.repository.PositionRepository;
import com.example.realestate.servise.PositionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    private PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public List<Position> getAll() {
        return this.positionRepository.findAll();
    }

    @Override
    public void insert(Position position) {
        this.positionRepository.save(position);
    }

    @Override
    public void update(String positionId, Position position) {
        Position updatePosition = this.positionRepository.getById(positionId);
        updatePosition.setPositionName(position.getPositionName());
        this.positionRepository.save(updatePosition);
    }

    @Override
    public void deleteById(String positionId) {
        this.positionRepository.deleteById(positionId);
    }

    @Override
    public Position getById(String positionId) {
        return this.positionRepository.getById(positionId);
    }
}
