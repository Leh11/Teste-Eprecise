package com.bioksam.controll;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/api-patient")
public class StateController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getList(){
        return "Tudo certo";
    }
}
