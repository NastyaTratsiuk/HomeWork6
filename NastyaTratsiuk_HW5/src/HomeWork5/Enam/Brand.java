package HomeWork5.Enam;

public enum Brand {
    MERCEDES("Mercedes-benz", "Germany", 2019),
    BMW("BMW X5", "Cermany", 2018),
    MAZDA("Mazda 6", "Japan", 2019),
    TESLA("Tesla X", "USA", 2020),
    LADA("Lada Vesta", "Russia", 2019);

    private String model;
    private String country;
    private int yearFoundation;

    Brand(String model, String country, int yearFoundation) {
        this.model = model;
        this.country = country;
        this.yearFoundation = yearFoundation;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.model = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearFoundation() {
        return yearFoundation;
    }

    public void setYearFoundation(int yearFoundation) {
        this.yearFoundation = yearFoundation;
    }
}
