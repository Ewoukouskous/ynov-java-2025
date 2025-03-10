package fr.ynov.java.car.type;

import fr.ynov.java.car.Brand;
import fr.ynov.java.car.CarType;
import fr.ynov.java.car.Vehicle;

public class Truck extends Vehicle {

    public Truck(Brand brand, String model, int year) {
        super(brand, model, year);
        setType(CarType.TRUCK);
    }

    @Override
    public double getDailyPrice() {
        return 15.50;
    }
}
