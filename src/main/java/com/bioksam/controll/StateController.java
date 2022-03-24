package com.bioksam.controll;

import com.bioksam.model.State;
import com.bioksam.service.StateService;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path(value = "/api/state")
public class StateController {

    @Inject
    StateService service;

    @GET
    @Path("/findStateByPage")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getList(@DefaultValue("0") @QueryParam("page") int page,
                               @DefaultValue("20") @QueryParam("size") int size){
        return Response.ok(service.find(page, size)).build();
    }

    @GET
    @Path("/amountState")
    @Produces
    public Long amount(){
        return service.amount();
    }

    @GET
    @Path("/findStateById")
    @Produces(MediaType.APPLICATION_JSON)
    public State findById(@QueryParam("id") Long id){
        return service.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(State state){
        service.persist(state);
        return Response.ok(state).build();
    }

    @PUT
    @Path("/updateState")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@QueryParam("id") Long id, State state){
        service.update(id, state);
        return Response.ok(state).build();
    }

    @DELETE
    @Path("deleteState")
    @Produces
    public Response delete(@QueryParam("id") Long id){
        service.delete(id);
        return Response.noContent().build();
    }
}
