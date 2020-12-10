package com.tiuliana;

import com.tiuliana.Bridge.*;
import com.tiuliana.Facade.CarFacade;
import com.tiuliana.Proxy.Car;
import com.tiuliana.Proxy.ProxySportCar;

public class Main {
    public static void main(String[] args)  {
        CarFacade facade = new CarFacade();
        facade.createCar();

        com.tiuliana.Bridge.Car SimpleCar1 = new SimpleCar(new Battery());
        SimpleCar1.getType();
        com.tiuliana.Bridge.Car SimpleCar2 = new SimpleCar(new Diesel());
        SimpleCar2.getType();
        com.tiuliana.Bridge.Car SportCar = new SportCar(new Petrol());
        SportCar.getType();

        com.tiuliana.Proxy.Car car = new ProxySportCar();
        try {
            car.connectTo("Tudor Dumitrescu");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
