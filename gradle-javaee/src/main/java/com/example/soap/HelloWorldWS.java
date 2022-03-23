package com.example.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldWS {
    @WebMethod
    public String say(String name) {
        return "Hello World JAX-WS " + name;
    }
}
