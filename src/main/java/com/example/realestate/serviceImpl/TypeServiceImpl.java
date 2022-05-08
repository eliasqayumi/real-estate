package com.example.realestate.serviceImpl;

import com.example.realestate.model.Type;
import com.example.realestate.repository.TypeRepository;
import com.example.realestate.servise.TypeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    private TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public List<Type> getAll() {
        return this.typeRepository.findAll();
    }

    @Override
    public void insert(Type type) {
        this.typeRepository.save(type);
    }

    @Override
    public void update(String typeId, Type type) {
        Type updateType= this.typeRepository.getById(typeId);
        updateType.setType(type.getType());
        this.typeRepository.save(updateType);
    }

    @Override
    public void deleteById(String typeId) {
        this.typeRepository.deleteById(typeId);
    }

    @Override
    public Type getById(String typeId) {
        return this.typeRepository.getById(typeId);
    }
}
