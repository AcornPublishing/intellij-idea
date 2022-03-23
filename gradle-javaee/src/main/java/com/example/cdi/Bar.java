package com.example.cdi;

import javax.enterprise.context.Dependent;
import java.io.Serializable;

@Dependent
public class Bar implements Serializable, Parent {
}
