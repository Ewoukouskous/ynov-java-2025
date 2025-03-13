package fr.ynov.java.car;

import fr.ynov.java.car.type.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static RentingSystem createDealership() {
        SportCar kimera = new SportCar(Brand.KIMERA, "Evo 37", 2021);
        Truck trafic = new  Truck(Brand.RENAULT, "Trafic", 1980);
        Van proace = new  Van(Brand.TOYOTA, "Proace", 2012);
        Sedan quattroporte = new Sedan(Brand.ALPINE, "Quattroporte", 2024);
        SUV purosangue = new SUV(Brand.FERRARI, "purosangue", 2023);

        RentingSystem dealership = new RentingSystem();

        dealership.addToFleet(kimera);
        dealership.addToFleet(trafic);
        dealership.addToFleet(proace);
        dealership.addToFleet(quattroporte);
        dealership.addToFleet(purosangue);

        return dealership;
    }

    public static void menu(RentingSystem dealership) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-=-=-=- Welcome to the Renting System -=-=-=-");
        System.out.println("1. See the vehicles \n2. See the rented vehicles \n3. Rent a vehicle \n4.Return a vehicle \n5. Exit");

        int choice = sc.nextInt();

        switch(choice) {
            case 1: dealership.displayFleet(); break;
            case 2: dealership.displayRentedFleet(); break;
            case 3: dealership.rentVehicle(chooseVehicle(dealership)); break;
            case 4:
        }
    }

    public static Vehicle chooseVehicle(RentingSystem dealership) {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = null;
        ArrayList<Vehicle> vehicles = dealership.getFleet();
        System.out.println(" Choose a vehicle :");

        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(i + ". " + vehicles.get(i).getBrand());
        }

        int choice =  sc.nextInt();

        return vehicles.get(choice);
    }

}
