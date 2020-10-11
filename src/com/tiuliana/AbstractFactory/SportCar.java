package com.tiuliana.AbstractFactory;

public class SportCar extends Car {

    @Override
    public SportCarWheels createWheels() {
        return new SportCarWheels();
    }

    @Override
    public SportCarEngine createEngine() {
        return new SportCarEngine();
    }

}
