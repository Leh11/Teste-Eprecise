package com.bioksam.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
@Data
public class State extends PanacheEntity {

    private String name;
    private String uf;
}
