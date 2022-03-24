package com.bioksam.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@Data
public class City extends PanacheEntity {
    private String name;
    private String sym;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
}
