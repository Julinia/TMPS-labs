package com.tiuliana.AbstractFactory;


public class SimpleCar extends Car {
    @Override
    public SimpleCarWheels createWheels() {
        return new SimpleCarWheels();
    }

    @Override
    public SimpleCarEngine createEngine() {
        return new SimpleCarEngine();
    }
}
