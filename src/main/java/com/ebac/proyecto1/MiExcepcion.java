package com.ebac.proyecto1;

public class MiExcepcion extends RuntimeException {

    public MiExcepcion(String message) {
        super("Ocurrio un error - " + message);
    }
}
