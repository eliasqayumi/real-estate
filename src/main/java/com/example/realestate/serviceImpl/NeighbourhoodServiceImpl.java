package com.example.realestate.serviceImpl;

import com.example.realestate.model.Neighbourhood;
import com.example.realestate.repository.NeighbourhoodRepository;
import com.example.realestate.servise.NeighbourhoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeighbourhoodServiceImpl implements NeighbourhoodService {
   private NeighbourhoodRepository neighbourhoodRepository;

   public NeighbourhoodServiceImpl(NeighbourhoodRepository neighbourhoodRepository) {
      this.neighbourhoodRepository = neighbourhoodRepository;
   }

   @Override
   public List<Neighbourhood> getAll() {
      return this.neighbourhoodRepository.findAll();
   }

   @Override
   public void insert(Neighbourhood neighbourhood) {
      this.neighbourhoodRepository.save(neighbourhood);
   }

   @Override
   public void update(String neighbourhoodId, Neighbourhood neighbourhood) {
      Neighbourhood updateNeighbourhood = this.neighbourhoodRepository.getById(neighbourhoodId);
      updateNeighbourhood.setNeighbourhoodName(neighbourhood.getNeighbourhoodName());
      updateNeighbourhood.setDistrict(neighbourhood.getDistrict());
      this.neighbourhoodRepository.save(updateNeighbourhood);
   }

   @Override
   public void deleteById(String neighbourhoodId) {
      this.neighbourhoodRepository.deleteById(neighbourhoodId);
   }

   @Override
   public Neighbourhood getById(String neighbourhoodId) {
      return this.neighbourhoodRepository.getById(neighbourhoodId);
   }
}
