package fr.ynov.java.car;

import java.util.Random;

public abstract class Vehicle {

    private String plate;
    private Brand brand;
    private String model;
    private CarType type;
    private int year;

    public Vehicle(Brand brand, String model, int year) {
        this.plate = generatePlate();
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String generatePlate() {
        Random random = new Random();

        String first = String.format("%02d", random.nextInt(99));
        String letters = "" + (char) ('A' + random.nextInt(26)) + (char) ('A' + random.nextInt(26)) + (char) ('A' + random.nextInt(26));
        String last = String.format("%2d", random.nextInt(99));

        return first + "-" + letters + "-" + last;
    }

    public void printCarInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Type: " + getType());
        System.out.println("Plate: " + getPlate());
    }

    public String getPlate() {
        return plate;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public CarType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}

