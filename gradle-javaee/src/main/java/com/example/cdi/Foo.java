package com.example.cdi;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Dependent
public class Foo implements Serializable {
    @Inject
    Boo boo;

    @Inject
    Bar bar;

    @NotNull
    private String name;
    @Pattern(regexp = "[0-9]")
    private String dept;

    public Boo getBoo() {
        return boo;
    }

    public Bar getBar() {
        return bar;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
