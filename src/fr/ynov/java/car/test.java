package fr.ynov.java.car;

import fr.ynov.java.car.type.*;

public class test {

    public static void main(String[] args) {
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
        dealership.displayFleet();

            // Test for 5. Renting System

//        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
//
//        dealership.rentVehicle(kimera);
//        dealership.rentVehicle(trafic);
//        dealership.displayRentedFleet();
//
//        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
//
//        dealership.rentVehicles(purosangue, 2);
//        dealership.rentVehicles(kimera, 5);
//
//        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
//
//        dealership.displayRentedFleet();
//
//        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
    }

}
