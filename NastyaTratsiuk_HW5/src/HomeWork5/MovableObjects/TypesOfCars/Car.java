package HomeWork5.MovableObjects.TypesOfCars;

import HomeWork5.Enam.Brand;
import HomeWork5.MovableObjects.Movable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Car implements Movable {

    final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    protected int price;
    protected String name;
    protected byte number;
    protected String color;
    protected boolean state;
    protected Brand copyBrand;
    Date date = new Date();
    String formatterDate = dateFormat.format(date);

    public Car(String name, byte number, String color, boolean state, Brand copyBrand, int price, String formatterDate) {
        this.name = name;
        this.number = number;
        this.color = color;
        this.state = state;
        this.copyBrand = copyBrand;
        this.price = price;
        this.formatterDate = formatterDate;
    }

    Car() {
        System.out.println("Beautiful car!");
    }

    public abstract void move();

    public abstract void going();

    public void going(boolean inspection) {
        System.out.println();
        if (inspection) {
            System.out.println("I can go!");
        }
    }

    public void brake() {
        System.out.println("The car stops.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", color='").append(color).append('\'');
        sb.append(", state=").append(state);
        sb.append(", copyBrand=").append(copyBrand);
        sb.append(", formatterDate=").append(formatterDate);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number &&
                state == car.state &&
                Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, color, state);
    }

    class Engine {

        final int maxPower = 3000;

        int power;
        int size;
        int modelID;
        String producter;

        public Engine(int power, int size, int modelID, String producter) {
            this.power = power;
            this.size = size;
            this.modelID = modelID;
            this.producter = producter;
        }

        void maximumPower(int power) {
            if (power == maxPower) {
                System.out.println("This is the most powerful engine!");
            } else if (power < maxPower) {
                System.out.println("It is not the most powerful engine.");
            } else {
                System.out.println("No such engine exists yet!");
            }
        }

        public int getModelID() {
            return modelID;
        }

        public void setModelID(int modelID) {
            this.modelID = modelID;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getProducter() {
            return producter;
        }

        public void setProducter(String producter) {
            this.producter = producter;
        }
    }
}

