package com.tiuliana.Bridge;

public class SportCar extends Car {
    public SportCar(Combustible combustible) {
        super(combustible);
    }

    @Override
    public void getType() {
        System.out.print("Sport car has configuration for:");
        combustible.hasCombustible();
    }
}
