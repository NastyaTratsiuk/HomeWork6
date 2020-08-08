package HomeWork5.MovableObjects.TypesOfCars;

import HomeWork5.Enam.Brand;

public class Truck extends Car {

    double weightTransporterCargo;
    int bodyLenght;
    boolean refrigerator;
    int standartTruck;
    int minimumStandardEurope = 5;

    public Truck(String name, byte number, String color, boolean state, Brand copyBrend, int price, String formatterDate,
                 double weightTransporterCargo, int bodyLenght, boolean refrigerator,
                 int standartTruck) {
        super(name, number, color, state, copyBrend, price, formatterDate);
        this.weightTransporterCargo = weightTransporterCargo;
        this.bodyLenght = bodyLenght;
        this.refrigerator = refrigerator;
        this.standartTruck = standartTruck;
    }

    @Override
    public void move() {
        System.out.println("I can moving!");
    }

    void typeTruck(boolean refrigerator) {
        String typeTruck = (refrigerator == true) ? "Transports perishable food." : "Сarries ordinary cargo.";
        System.out.println(typeTruck);
    }

    void whereTheTruckCanMove(int standartTruck) {
        String whereTheTruckCanMove = (standartTruck >= minimumStandardEurope) ? "The truck is allowed to cross Europe" :
                "Truck is not allowed to cross Europe";
        System.out.println(whereTheTruckCanMove);
    }

    @Override
    public void going() {
        System.out.println("Truck is going!");
    }

    public void going(boolean loadet) {
        System.out.println();
        if (loadet) {
            System.out.println("I am fully loaded!");
        }
    }

    public void brake() {
        System.out.println("The car stops.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", color='").append(color).append('\'');
        sb.append(", state=").append(state);
        sb.append(", copyBrand=").append(copyBrand);
        sb.append(", formatterDate=").append(formatterDate);
        sb.append("weightTransporterCargo=").append(weightTransporterCargo);
        sb.append(", bodyLenght=").append(bodyLenght);
        sb.append(", refrigerator=").append(refrigerator);
        sb.append(", standartTruck=").append(standartTruck);
        sb.append('}');
        return sb.toString();
    }

    class fuelTank {

        final int typeFuelTank1 = 1;
        final int typeFuelTank2 = 2;
        final int typeFuelTankEvro = 3;
        final int maxValueType1 = 250;
        final int maxValueType2 = 600;
        final int maxValueTypeEvro = 1100;

        int typeFuelTank;
        int maximumValue;
        boolean additionalFuelTank;

        int typeFuelTank(int typeFuelTank) {
            if (typeFuelTank == typeFuelTank1) {
                maximumValue = maxValueType1;
                System.out.println(maximumValue);
            } else if (typeFuelTank == typeFuelTank2) {
                maximumValue = maxValueType2;
                System.out.println(maximumValue);
            } else if (typeFuelTank == typeFuelTankEvro) {
                maximumValue = maxValueTypeEvro;
                System.out.println(maximumValue);
            } else {
                System.out.println("This type does not exist!");
            }
            return maximumValue;
        }

        public int getTypeFuelTank() {
            return typeFuelTank;
        }

        public void setTypeFuelTank(int typeFuelTank) {
            this.typeFuelTank = typeFuelTank;
        }

        public void setAdditionalFuelTank(boolean additionalFuelTank) {
            this.additionalFuelTank = additionalFuelTank;
        }

    }
}

