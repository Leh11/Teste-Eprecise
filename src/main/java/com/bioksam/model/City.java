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

    //apenas para auxiliar na recuperação de estado
    private Long auxState_id;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
}
