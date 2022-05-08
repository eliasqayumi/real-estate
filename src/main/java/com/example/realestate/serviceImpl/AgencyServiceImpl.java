package com.example.realestate.serviceImpl;

import com.example.realestate.model.Agency;
import com.example.realestate.repository.AgencyRepository;
import com.example.realestate.servise.AgencyService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AgencyServiceImpl implements AgencyService {
    private AgencyRepository agencyRepository;

    public AgencyServiceImpl(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    @Override
    public List<Agency> getAll() {
        return this.agencyRepository.findAll();
    }

    @Override
    public void insert(Agency agency) {
        this.agencyRepository.save(agency);
    }

    @Override
    public void update(String agencyId, Agency agency) {
        Agency updateAgency = this.agencyRepository.getById(agencyId);
        updateAgency.setAgencyName(agency.getAgencyName());
        this.agencyRepository.save(updateAgency);
    }

    @Override
    public void deleteById(String agencyId) {
        this.agencyRepository.deleteById(agencyId);
    }

    @Override
    public Agency getById(String agencyId) {
        return this.agencyRepository.getById(agencyId);
    }
}
