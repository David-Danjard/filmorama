package com.david.danjard.filmorama.resources;

import com.david.danjard.filmorama.config.EnvironmentProperties;
import com.david.danjard.filmorama.dto.SimpleResponse;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/info")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InfoResource {

    @Inject
    EnvironmentProperties environmentProperties;

    @GET
    @Path("/env-name")
    public SimpleResponse getEnvName(){
        return new SimpleResponse(environmentProperties.getFullName());
    }

}
