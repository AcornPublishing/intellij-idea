package com.example.jsf;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class HelloBean implements Serializable {
    private String name = "";

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String say() {
        return "こんにちは" + name;
    }
}
