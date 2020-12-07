package com.tiuliana.Context;

import com.tiuliana.Strategy.AntiLockBrakeSystem;

public class SportUtilityCar extends Car {
    public SportUtilityCar() {
        super(new AntiLockBrakeSystem(), "SportUtilityCar");
    }
}
