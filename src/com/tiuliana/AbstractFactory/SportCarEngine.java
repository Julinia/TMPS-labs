package com.tiuliana.AbstractFactory;

public class SportCarEngine extends Engine {
    private static final String type = "turbo";

    @Override
    public void getDescription() {
        System.out.println("Sport car engine: " + type);
    }
}
