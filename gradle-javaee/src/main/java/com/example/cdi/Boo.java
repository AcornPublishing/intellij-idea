package com.example.cdi;

import javax.enterprise.context.Dependent;
import java.io.Serializable;

@Dependent
public class Boo implements Serializable, Parent {
}
