package com.tiuliana.AbstractFactory;

public class SimpleCarEngine extends Engine {
    private static final String type = "atmo";

    @Override
    public void getDescription() {
        System.out.println("Simple car engine: " + type);
    }
}
