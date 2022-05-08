package com.example.realestate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room_numbers")
public class RoomNumber {
    @Id
    @Column(name = "room_number_id", nullable = false, length = 10)
    private String id;

    @Column(name = "room_number", nullable = false, length = 10)
    private String roomNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

}