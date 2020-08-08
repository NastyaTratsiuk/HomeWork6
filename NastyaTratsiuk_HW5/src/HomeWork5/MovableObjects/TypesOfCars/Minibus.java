package HomeWork5.MovableObjects.TypesOfCars;

import HomeWork5.Enam.Brand;

public class Minibus extends Car {

    int numberOfSeats;
    boolean availabilityOfSeats;
    boolean standingPlaces;

    public Minibus(String name, byte number, String color, boolean state, Brand copyBrand, int price, String formatterDate,
                   int numberOfSeats, boolean availabilityOfSeats, boolean standingPlaces) {
        super(name, number, color, state, copyBrand, price, formatterDate);
        this.numberOfSeats = numberOfSeats;
        this.availabilityOfSeats = availabilityOfSeats;
        this.standingPlaces = standingPlaces;
    }

    @Override
    public void move() {
        System.out.println("I can moving!");
    }

    void typeMinibus(boolean availabilityOfSeats) {
        String typeMinibus = (availabilityOfSeats == true) ? "Passenger minibus" : "Commersial minibas";
        System.out.println(typeMinibus);
    }

    void numberOfPeopleCarried(boolean standingPlaces) {
        String numberOfPeopleCarried = (standingPlaces == true) ? ("Can carry more people" + numberOfSeats) :
                ("Can carry people" + numberOfSeats);
        System.out.println(numberOfPeopleCarried);
    }

    @Override
    public void going() {
        System.out.println();
    }

    public void going(boolean checkBeforeDeparture) {
        System.out.println();
        if (checkBeforeDeparture) {
            System.out.println("Can start work!");
        }
    }

    public void brake() {
        System.out.println("The car stops.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Minibus{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", color='").append(color).append('\'');
        sb.append(", state=").append(state);
        sb.append(", copyBrand=").append(copyBrand);
        sb.append(", formatterDate=").append(formatterDate);
        sb.append("numberOfSeats=").append(numberOfSeats);
        sb.append(", availabilityOfSeats=").append(availabilityOfSeats);
        sb.append(", standingPlaces=").append(standingPlaces);
        sb.append('}');
        return sb.toString();
    }

    static class Buttery {

        final int standardBatteryVolume = 80;
        final int overageBatteryVolume = 90;
        final int powerfulBattery = 100;
        boolean tv;
        boolean automaticDoors;
        int batteryVolume;

        int batterySelection(boolean tv, boolean automaticDoors) {
            if (tv && automaticDoors) {
                batteryVolume = powerfulBattery;
            } else if ((tv && automaticDoors == false) || (tv == false && automaticDoors)) {
                batteryVolume = overageBatteryVolume;
            } else {
                batteryVolume = standardBatteryVolume;
            }
            System.out.println(batteryVolume);
            return batteryVolume;
        }

    }
}

