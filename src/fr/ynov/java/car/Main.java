package fr.ynov.java.car;

public class Main {

    public static void main(String[] args) {

        RentingSystem dealership = new RentingSystem();
        dealership = Utils.createDealership();

        Vehicle test = Utils.chooseVehicle(dealership);
        System.out.println("Vehicle choosen is " + test.getBrand() + "\n");

    }

}
