package com.tiuliana.Strategy;

public class DiscBrakeSystem implements BrakeSystem{
    @Override
    public void brake() { System.out.println("Disc Brakes applied."); }
}
