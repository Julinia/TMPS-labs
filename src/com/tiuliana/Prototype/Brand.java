package com.tiuliana.Prototype;

public class Brand implements Cloneable{
    public enum Model {
        BMW,
        Mercedes,
        Audi,
        Toyota
    }

    public int year;
    public Model model;

    public Brand() {
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    @Override
    public Brand clone() {
        try {
            return (Brand) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
