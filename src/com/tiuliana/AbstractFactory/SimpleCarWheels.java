package com.tiuliana.AbstractFactory;

public class SimpleCarWheels extends Wheels {
    private static String type = "all terrain";

    @Override
    public void getDescription() {
        System.out.println("Simple Car wheels: " + type);
    }
}
