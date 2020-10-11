package com.tiuliana.Factory;

import com.tiuliana.Builder.Engine;
import com.tiuliana.Builder.Wheels;

public abstract class Car {

    abstract Engine createEngine();
    abstract Wheels createWheels();

}
