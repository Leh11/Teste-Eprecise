package com.bioksam.service;

import com.bioksam.model.State;
import com.bioksam.repository.StateRepo;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.panache.common.Page;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.WebApplicationException;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class StateService {

    @Inject
    StateRepo repo;

    @Transactional
    public void persist(State state){
        repo.persist(state);
    }

    public List<State> find(int page, int size){
        return  repo.findAll().page(Page.of(page, size)).list();
    }

    public State findById(Long id){
        Optional<State> obj = Optional.ofNullable(repo.findById(id));
        return obj.orElseThrow(()-> new WebApplicationException("Cidade com id "+id+" não existe", 404));
    }

    public void update(Long id, State state){
        State onUpdate = findById(id);
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
}
