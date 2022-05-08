package com.example.realestate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "home_type")
public class HomeType {
    @Id
    @Column(name = "home_type_id", nullable = false, length = 10)
    private String id;

    @Column(name = "home_type_name", nullable = false, length = 50)
    private String homeTypeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomeTypeName() {
        return homeTypeName;
    }

    public void setHomeTypeName(String homeTypeName) {
        this.homeTypeName = homeTypeName;
    }

}