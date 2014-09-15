package com.ovoenergy.service.smart.meter.resouce;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/meter")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SmartMeterResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(SmartMeterResource.class);



//
//    @PUT
//    @Path("changeResponse")
//    @Timed
//    public Response.Status changeResponse(String response) {
//        try {
//            responseBuilder.addResponseToList(response);
//            return Response.Status.OK;
//        } catch (Exception ex) {
//            LOGGER.error("Exception storing the new response: ", ex);
//            return Response.Status.OK;
//        }
//    }



}