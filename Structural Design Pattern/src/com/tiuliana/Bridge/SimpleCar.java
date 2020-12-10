package com.tiuliana.Bridge;

public class SimpleCar extends Car {
    public SimpleCar(Combustible combustible) {
        super(combustible);
    }

    @Override
    public void getType() {
        System.out.print("Simple car has configuration for:");
        combustible.hasCombustible();
    }
}
