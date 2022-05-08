package com.example.realestate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "neighbourhood")
public class Neighbourhood {
    @Id
    @Column(name = "neighbourhood_id", nullable = false, length = 10)
    private String id;

    @Column(name = "neighbourhood_name", nullable = false, length = 50)
    private String neighbourhoodName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "district_id", nullable = false)
    private District district;



}