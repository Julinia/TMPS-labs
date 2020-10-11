package com.tiuliana.AbstractFactory;

public class SportCarWheels extends Wheels {
    private static String type = "slick";

    @Override
    public void getDescription() {
        System.out.println("Sport Car Wheels: " + type);
    }

}
