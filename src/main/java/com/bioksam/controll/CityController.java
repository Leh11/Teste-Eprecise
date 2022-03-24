package com.bioksam.controll;

import com.bioksam.model.City;
import com.bioksam.service.CityService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/api/city")
public class CityController {

    @Inject
    CityService service;

    @GET
    @Path("/findByPage")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll(@DefaultValue("0") @QueryParam("page") int page,
                               @DefaultValue("3") @QueryParam("size") int size){
        return Response.ok(service.find(page, size)).build();
    }

    @GET
    @Path("/amountCity")
    @Produces
    public Long amount(){
        return service.amount();
    }

    @GET
    @Path("/findCity")
    @Produces(MediaType.APPLICATION_JSON)
    public City findById(@QueryParam("id") Long id){
        return service.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(City city){
        service.persist(city);
        return Response.ok(city).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@QueryParam("id") Long id, City city){
        service.update(id, city);
        return Response.ok(city).build();
    }

    @DELETE
    @Path("deleteCity")
    @Produces
    public Response delete(@QueryParam("id") Long id){
        service.delete(id);
        return Response.noContent().build();
    }
}
