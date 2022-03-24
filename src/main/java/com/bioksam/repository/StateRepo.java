package com.bioksam.repository;

import com.bioksam.model.State;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StateRepo implements PanacheRepository<State> {

}
