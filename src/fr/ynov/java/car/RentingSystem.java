package fr.ynov.java.car;

import java.util.ArrayList;
import java.util.Objects;

public class RentingSystem {

    private ArrayList<Vehicle> fleet;
    private ArrayList<Vehicle> rentedVehicles;

    public RentingSystem() {
        fleet = new ArrayList<>();
        rentedVehicles = new ArrayList<>();
    }

    public void addToFleet(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void removeFromFleet(Vehicle vehicle) {
        fleet.remove(vehicle);
    }

    public void addToRentedVehicles(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
    }

    public void removeFromRentedVehicles(Vehicle vehicle) {
        rentedVehicles.remove(vehicle);
    }

    public void rentVehicle(Vehicle vehicle) {
        removeFromFleet(vehicle);
        addToRentedVehicles(vehicle);
    }

    public void returnVehicle(Vehicle vehicle) {
        removeFromFleet(vehicle);
        addToRentedVehicles(vehicle);
    }

    public void displayFleet() {
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle.printCarInfo());
        }
    }

    public void displayRentedFleet() {
        for (Vehicle vehicle : rentedVehicles) {
            System.out.println(vehicle.printCarInfo());
        }
    }

    public boolean rentVehicles(Vehicle vehicle, int days, Customer customer) {
        for (Vehicle check : rentedVehicles) {
            if (Objects.equals(vehicle.getPlate(), check.getPlate())) {
                System.out.println("this vehicle is already rented");
                return false;
            }
            if ( customer.getVehicle() == null) {

                double totalPrice = vehicle.getDailyPrice() * days;
                System.out.println("Price of the rent is " + totalPrice + "\n you rent this vehicle");
                removeFromFleet(vehicle);
                addToRentedVehicles(vehicle);
                return true;
            } else {
                System.out.println("this customer already have a vehicle");
            }
        }
        return false;
    }

}
