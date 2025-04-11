package com.eliascanalesnieto.singleton;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        if (INSTANCE != null) {
            throw new AssertionError("Constructor not allowed");
        }
    }

    @Serial
    public Object readResolve() {
        return INSTANCE;
    }

}
