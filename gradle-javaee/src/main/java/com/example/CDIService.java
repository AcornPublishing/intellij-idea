package com.example;

import com.example.cdi.Foo;
import com.example.cdi.Parent;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

@SessionScoped
public class CDIService implements Serializable {
    @Inject
    Foo foo;

    @Inject
    Parent obj;
}
