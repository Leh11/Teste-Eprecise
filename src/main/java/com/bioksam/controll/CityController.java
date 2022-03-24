package com.bioksam.controll;

import com.bioksam.model.City;
import com.bioksam.service.CityService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/api/city")
public class CityController {

    @Inject
    CityService service;

    @GET
    @Path("/findCityByPage")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll(@DefaultValue("0") @QueryParam("page") int page,
                               @DefaultValue("10") @QueryParam("size") int size){
        return Response.ok(service.find(page, size)).build();
    }

    @GET
    @Path("/amountCity")
    @Produces
    public Long amount(){
        return service.amount();
    }

    @GET
    @Path("/findCityById")
    @Produces(MediaType.APPLICATION_JSON)
    public City findById(@QueryParam("id") Long id){
        return service.findById(id);
    }

    @GET
    @Path("/findCityByName")
    @Produces(MediaType.APPLICATION_JSON)
    public City findByName(@QueryParam("name") String name){
        return service.findByName(name);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(City city){
        service.persist(city);
        return Response.ok(city).build();
    }

    @PUT
    @Path("/updateCity")
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
