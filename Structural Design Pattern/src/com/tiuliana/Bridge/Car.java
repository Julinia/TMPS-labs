package com.tiuliana.Bridge;

public abstract class Car {
    protected Combustible combustible;

    public Car(Combustible combustible) {
        this.combustible = combustible;
    }

    abstract public void getType();
}
