package HomeWork5;

import HomeWork5.MovableObjects.TypesOfCars.Car;
import HomeWork5.MovableObjects.TypesOfCars.Minibus;

public class Store<T extends Car> {

    private int cash;
    private final T[] products;

    public Store(T[] products) {
        this.products = products;
    }

    public void printProducts(T[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + " " + products[i]);

        }
    }

    public T[] sell(int i, int sumMoney) {
        T[] newProducts = (T[]) new Minibus[products.length - 1];
        int index = 0;
        if (sumMoney >= products[i].getPrice()) {
            for (int j = 0; j < products.length; j++) {
                if (products[j] != products[i]) {
                    newProducts[index] = products[j];

                    index++;
                }
            }
            cash += sumMoney;
            System.out.println("Cash = " + cash);
            for (int j = 0; j < newProducts.length; j++)
                System.out.println(j + " " + newProducts[j]);
            {
            }
        } else {
            System.out.println("The amount is not enough to buy the product!");
        }
        return newProducts;
    }

    public T[] puchase(int money, int i) {
        T[] newProducts = (T[]) new Minibus[products.length + 1];
        int count = 0;
        if (money <= products[i].getPrice() && cash >= money) {
            for (int j = 0; j < products.length; j++) {
                newProducts[count] = products[j];
                count++;
                newProducts[newProducts.length - 1] = products[i];
            }
            cash -= money;
            System.out.println("Cash = " + cash);
            for (int j = 0; j < newProducts.length; j++) {
                System.out.println(j + " " + newProducts[j]);
            }
        } else {
            System.out.println("We can`t buy this product!");
        }
        return newProducts;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
