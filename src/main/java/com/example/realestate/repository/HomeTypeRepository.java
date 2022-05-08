package com.example.realestate.repository;

import com.example.realestate.model.HomeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeTypeRepository extends JpaRepository<HomeType,String> {
}
