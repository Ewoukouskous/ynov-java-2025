package fr.ynov.java.car;

import fr.ynov.java.car.type.SportCar;

public class test {

    public static void main(String[] args) {
        SportCar car1 = new SportCar(Brand.KIMERA, "Evo 37", 2021);
        car1.printCarInfo();
    }

}
