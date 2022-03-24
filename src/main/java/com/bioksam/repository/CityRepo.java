package com.bioksam.repository;

import com.bioksam.model.City;
import com.bioksam.model.State;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CityRepo implements PanacheRepository<City> {

}
