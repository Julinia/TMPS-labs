package com.tiuliana.Strategy;

public class AntiLockBrakeSystem implements BrakeSystem{
    @Override
    public void brake() { System.out.println("Anti Lock Brakes applied."); }
}