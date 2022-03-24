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
import javax.ws.rs.WebApplicationException;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class CityService {

    @Inject
    CityRepo repo;
    @Inject
    StateRepo stateRepo;

    @Transactional
    public void persist(City city){
        State state = stateRepo.findById(city.getAuxState_id());
        city.setState(state);
        repo.persist(city);
    }

    public List<City> find(int page, int size){

        return  repo.findAll().page(Page.of(page, size)).list();
    }

    public City findById(Long id){
        Optional<City> obj = Optional.ofNullable(repo.findById(id));
        return obj.
                orElseThrow(()-> new WebApplicationException("Cidade com id "+id+" não existe", 404));
    }

    public void update(Long id, City city){
        City onUpdate = findById(id);
        persist(onUpdate);
    }

    public Long amount(){
        return  repo.count();
    }

    @Transactional
    public void delete(Long id){
        findById(id);
        repo.deleteById(id);
    }

    public City findByName(String name) {
        return repo.find("name", name).firstResult();
    }
}
