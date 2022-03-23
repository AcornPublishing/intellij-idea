package com.example.cdi;

import javax.enterprise.inject.Produces;

public class Producer {
    @Produces
    Parent getObject() {
        return new Bar();
    }
}
