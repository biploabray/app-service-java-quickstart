package com.microsoft.dukes.greeting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("Biplob_COIS13034")
public class HelloDukeResource {

    @Path("hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DukesGreetingRecord sayHello() {
        return new DukesGreetingRecord("Welcome to COIS13034!!!!", LocalDate.now());
    }
}
