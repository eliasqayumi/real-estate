package com.example.realestate.repository;

import com.example.realestate.model.RoomNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomNumberRepository extends JpaRepository<RoomNumber,String> {
}
