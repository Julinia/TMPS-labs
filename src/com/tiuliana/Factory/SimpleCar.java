package com.tiuliana.Factory;

import com.tiuliana.Builder.SimpleCarEngine;
import com.tiuliana.Builder.SimpleCarWheels;



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
