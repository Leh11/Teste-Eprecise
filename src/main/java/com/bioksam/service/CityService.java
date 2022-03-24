package com.bioksam.service;

import com.bioksam.model.City;
import com.bioksam.model.State;
import com.bioksam.repository.CityRepo;
import com.bioksam.repository.StateRepo;
import io.quarkus.panache.common.Page;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class CityService {

    @Inject
    CityRepo repo;

    @Transactional
    public void persist(City city){
        repo.persist(city);
    }

    public List<City> find(int page, int size){

        return  repo.findAll().page(Page.of(page, size)).list();
    }

    public City findById(Long id){
        Optional<City> obj = Optional.ofNullable(repo.findById(id));
        return obj.orElseThrow(()-> new BadRequestException("Id " +id+ " não existe"));
    }

    public void update(Long id, City city){
        City onUpdate = findById(id);

        onUpdate.setName(city.getName());
        onUpdate.setSym(city.getSym());
        onUpdate.setState(city.getState());
        repo.persist(onUpdate);
    }

    public Long amount(){
        return  repo.count();
    }

    @Transactional
    public void delete(Long id){
        findById(id);
        repo.deleteById(id);
    }
}
