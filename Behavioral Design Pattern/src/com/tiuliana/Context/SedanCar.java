package com.tiuliana.Context;

import com.tiuliana.Strategy.DiscBrakeSystem;

public class SedanCar extends Car {
    public SedanCar() {
        super(new DiscBrakeSystem(), "Sedan");
    }
}