package com.tiuliana.Builder;

public class Car {
    public String color;
    public String brand;
    public int numberOfSeats;
    public int numberOfDoors;
    public boolean isConvertible;

    public Car(String color, String brand, int numberOfSeats, int numberOfDoors, boolean isConvertible ){
        this.brand = brand;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }
}
