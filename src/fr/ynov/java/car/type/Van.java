package fr.ynov.java.car.type;

import fr.ynov.java.car.Brand;
import fr.ynov.java.car.CarType;
import fr.ynov.java.car.Vehicle;

public class Van extends Vehicle {

    public Van(Brand brand, String model, int year) {
        super(brand, model, year);
        setType(CarType.VAN);
    }
}
