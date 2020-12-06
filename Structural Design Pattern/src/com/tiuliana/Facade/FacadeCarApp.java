package com.tiuliana.Facade;

class CarBody {
    public void setCarBody(){
        System.out.println("Car body is set.");
    }
}

class CarEngine {
    public void setCarEngine(){
        System.out.println("Car Engine is set.");
    }
}

class CarAccessories {
    public void setCarAccessories(){
        System.out.println("Car accessories are set.");
    }
}

class CarFacade {
    private CarEngine engine;
    private CarBody body;
    private CarAccessories accessories;
    public CarFacade(){
        this.engine = new CarEngine();
        this.body = new CarBody();
        this.accessories = new CarAccessories();
    }
    public void createCar(){
        System.out.println("Creating a car...");
        engine.setCarEngine();
        body.setCarBody();
        accessories.setCarAccessories();
        System.out.println("Your car is ready.");
    }
}

public class FacadeCarApp {
    public static void main(String[] args) {
        CarFacade facade = new CarFacade();
        facade.createCar();
    }
}