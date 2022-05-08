package com.example.realestate.model;

import javax.persistence.*;

@Entity
@Table(name = "district")
public class District {
    @Id
    @Column(name = "district_id", nullable = false, length = 20)
    private String id;

    @Column(name = "district_name", nullable = false, length = 50)
    private String districtName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}