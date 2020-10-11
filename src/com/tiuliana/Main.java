package com.tiuliana;

import com.tiuliana.AbstractFactory.Engine;
import com.tiuliana.AbstractFactory.Wheels;
import com.tiuliana.AbstractFactory.Creator;
import com.tiuliana.Builder.Car;
import com.tiuliana.Builder.CarBuilder;
import com.tiuliana.Prototype.Brand;

public class Main {
    public static void main(String[] args) {
        createCar("sport car");

        Brand brand = new Brand();
        brand.setModel(Brand.Model.BMW);
        brand.setYear(2000);
        Brand brandCopy = brand.clone();
        brandCopy.setYear(2001);
        System.out.println("the year of the first car: " + brand.getYear());
        System.out.println("the year of the second car:" + brandCopy.getYear());
        Car car = new CarBuilder().setColor("black").setBrand("Toyota").setNumberOfSeats(4).setNumberOfDoors(2).setIsConvertible(true).createCar();
        System.out.println(car.isConvertible);
    }

    public static void createCar(String type) {
        com.tiuliana.AbstractFactory.Car carFactory = Creator.createFactory(type);
        Wheels wheels = carFactory.createWheels();
        Engine engine = carFactory.createEngine();
        wheels.getDescription();
        engine.getDescription();
        System.out.println();
    }

}
