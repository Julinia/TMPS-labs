package com.tiuliana.Proxy;

public class SportCar implements Car {
    @Override
    public void connectTo(String owner)
    {
        System.out.println("Engine can start. Owner is "+ owner);
    }
}