package HomeWork5;

import HomeWork5.Enam.Brand;
import HomeWork5.MovableObjects.Bicycle;
import HomeWork5.MovableObjects.Motorcycle;
import HomeWork5.MovableObjects.Movable;
import HomeWork5.MovableObjects.TypesOfCars.Car;
import HomeWork5.MovableObjects.TypesOfCars.Minibus;
import HomeWork5.MovableObjects.TypesOfCars.Truck;

public class Main {


    public static void main(String[] args) {
        Car truck = new Truck("Andrey", (byte) 5, "Green", true, Brand.BMW, 20000, "01/Jul/2019", 13.6,
                15, true, 5);
        Movable bicycle = new Bicycle(true, 16);
        Movable motorcycle = new Motorcycle(true, 4);

        System.out.println(truck);
        System.out.println(bicycle);
        System.out.println(motorcycle);
        truck.going(true);

        Car[] minibus = new Minibus[]{
                new Minibus("Minibus 1", (byte) 1, "Green", true, Brand.BMW, 4000,
                        "01/12/2019", 20, true, true),
                new Minibus("Minibus 2", (byte) 2, "Black", true, Brand.MAZDA, 5000,
                        "01/06/2018", 15, true, true),
                new Minibus("Minibus 3", (byte) 3, "Yellow", true, Brand.MERCEDES, 6000,
                        "15/02/2019", 17, true, true),
                new Minibus("Minibus 4", (byte) 4, "Gold", true, Brand.TESLA, 10000,
                        "15/01/2020", 10, true, true)};
        Store<Car> minibusStore = new Store<>(minibus);
        minibusStore.printProducts(minibus);
        minibusStore.sell(1, 5000);
        minibusStore.puchase(1000, 2);

    }
}
