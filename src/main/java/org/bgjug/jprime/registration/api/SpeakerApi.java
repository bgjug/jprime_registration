package org.bgjug.jprime.registration.api;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/speaker")
@Produces(MediaType.APPLICATION_JSON)
public interface SpeakerApi {

    @GET
    @Path("{branch}")
    Response allSpeakers(@PathParam("branch") String branch);
}
