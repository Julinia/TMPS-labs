package com.tiuliana.Factory;

import com.tiuliana.Builder.SportCarEngine;
import com.tiuliana.Builder.SportCarWheels;

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
