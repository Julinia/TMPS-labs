package com.tiuliana.Bridge;


abstract class Car {
    protected Combustible combustible;

    public Car(Combustible combustible) {
        this.combustible = combustible;
    }

    abstract public void getType();
}

class SportCar extends Car {
    SportCar(Combustible combustible){
        super(combustible);
    }

    @Override
    public void getType(){
        System.out.print("Sport car has configuration for:");
        combustible.hasCombustible();
    }
}

class SimpleCar extends Car {
    SimpleCar(Combustible combustible){
        super(combustible);
    }

    @Override
    public void getType(){
        System.out.print("Simple car has configuration for:");
        combustible.hasCombustible();
    }
}

interface Combustible {
    void hasCombustible();
}

class Battery implements Combustible {

    @Override
    public void hasCombustible() {
        System.out.println(" electricity");
    }
}

class Petrol implements Combustible {

    @Override
    public void hasCombustible() {
        System.out.println(" petrol");
    }
}

class Diesel implements Combustible {

    @Override
    public void hasCombustible() {
        System.out.println(" diesel");
    }
}

class BridgePattern {
    public static void main(String[] args)
    {
        Car SimpleCar1 = new SimpleCar(new Battery());
        SimpleCar1.getType();
        Car SimpleCar2 = new SimpleCar(new Diesel());
        SimpleCar2.getType();
        Car SportCar = new SportCar(new Petrol());
        SportCar.getType();
    }
}