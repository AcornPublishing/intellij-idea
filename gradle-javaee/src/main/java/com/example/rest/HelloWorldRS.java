package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/helloworld/{name}")
public class HelloWorldRS {
    @GET
    @Produces("text/plain; charset=UTF-8")
    public String say(@PathParam("name") String name) {
        return "Hello World JAX-RS " + name;
    }
}
