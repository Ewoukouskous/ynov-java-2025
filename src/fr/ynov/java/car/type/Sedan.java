package fr.ynov.java.car.type;

import fr.ynov.java.car.Brand;
import fr.ynov.java.car.CarType;
import fr.ynov.java.car.Vehicle;

public class Sedan extends Vehicle {
    public Sedan(Brand brand, String model, int year) {
        super(brand, model, year);
        setType(CarType.SEDAN);
    }
}
