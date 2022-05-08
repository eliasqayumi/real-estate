package com.example.realestate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactId implements Serializable {
    private static final long serialVersionUID = -3947999236186891983L;
    @Column(name = "tc_no", nullable = false, length = 11)
    private String tcNo;

    @Column(name = "phone_number", nullable = false, length = 14)
    private String phoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ContactId entity = (ContactId) o;
        return Objects.equals(this.phoneNumber, entity.phoneNumber) &&
                Objects.equals(this.tcNo, entity.tcNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, tcNo);
    }

}