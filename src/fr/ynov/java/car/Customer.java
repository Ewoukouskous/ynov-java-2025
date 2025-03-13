package fr.ynov.java.car;

public class Customer {

    private String name;
    private int age;
    private boolean license;
    private Vehicle vehicle;

    public Customer(String name, int age, boolean license) {
        this.name = name;
        this.age = age;
        this.license = license;
        this.vehicle = null;
    }

    public boolean getLicense() {
        return license;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
