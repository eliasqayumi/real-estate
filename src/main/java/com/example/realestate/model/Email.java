package com.example.realestate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emails")
public class Email {
    @EmbeddedId
    private EmailId id;

    @MapsId("tcNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tc_no", nullable = false)
    private Employee tcNo;
}