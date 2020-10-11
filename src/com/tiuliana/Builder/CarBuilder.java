package com.tiuliana.Builder;

public class CarBuilder {
    private String color;
    private String brand;
    private int numberOfSeats;
    private int numberOfDoors;
    private boolean isConvertible;

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder setIsConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
        return this;
    }

    public Car createCar() {
        return new Car(color, brand, numberOfSeats, numberOfDoors, isConvertible);
    }
}