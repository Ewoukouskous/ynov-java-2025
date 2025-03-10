package fr.ynov.java.car;

import java.util.Random;

public class Customer {

    private String name;
    private int age;
    private int license;
    private Vehicle vehicle;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.license = setLicense();
        this.vehicle = null;
    }

    public int setLicense() {
        int licenseID = 0;
        Random random = new Random();
        licenseID =  random.nextInt(10000, 19999);
        return licenseID;
    }

    public int getLicense() {
        return license;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
