package com.tiuliana.AbstractFactory;

public abstract class Car {
    public abstract Engine createEngine();
    public abstract Wheels createWheels();
}
