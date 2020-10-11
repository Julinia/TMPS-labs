package com.tiuliana.Factory;


public class Creator {
    public static Car createFactory(String type) {

        if(type.equalsIgnoreCase("sport car")) {
            return new SportCar();
        } else if(type.equalsIgnoreCase("simple car")) {
            return new SimpleCar();
        } else {
            System.out.println("Please specify a valid type");
            return null;
        }

    }
}
