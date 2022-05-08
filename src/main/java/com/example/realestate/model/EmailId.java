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
public class EmailId implements Serializable {
    private static final long serialVersionUID = 880777819512363666L;
    @Column(name = "tc_no", nullable = false, length = 11)
    private String tcNo;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmailId entity = (EmailId) o;
        return Objects.equals(this.tcNo, entity.tcNo) &&
                Objects.equals(this.email, entity.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tcNo, email);
    }

}