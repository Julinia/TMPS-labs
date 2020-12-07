package com.tiuliana;

import com.tiuliana.Context.Car;
import com.tiuliana.Context.SportUtilityCar;
import com.tiuliana.Context.SedanCar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Car Break System:");
        Car sedanCar = new SedanCar();
        sedanCar.applyBrake();
        Car suvCar = new SportUtilityCar();
        suvCar.applyBrake();
    }
}