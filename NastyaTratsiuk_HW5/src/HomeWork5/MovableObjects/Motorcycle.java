package HomeWork5.MovableObjects;

public class Motorcycle implements Movable {

    boolean stroller;
    int engineCapacity;
    int lowEngineDisplasement = 250;
    int mediumСubicEngine = 900;
    int highCapasities = 2300;

    public Motorcycle(boolean stroller, int engineCapacity) {
        this.stroller = stroller;
        this.engineCapacity = engineCapacity;
    }

    public void move() {
        System.out.println("I can moving!");
    }

    public void move(int possibleSpeed) {
        System.out.println("I can moving!");
        if (possibleSpeed >= 100) {
            System.out.println("I can move quickly!");
        }
    }

    void exstraSpace(boolean stroller) {
        String exstraSpace = (stroller == true) ? "You can carry cargo or person!" :
                "You can't carry cargo or person";
        System.out.println(exstraSpace);
    }

    void engineСompari(int engineCapacity) {
        if (engineCapacity <= lowEngineDisplasement) {
            System.out.println("Top speed and fuel consumption will be low!");
        } else if (engineCapacity > lowEngineDisplasement || engineCapacity <= mediumСubicEngine) {
            System.out.println("Maximum speed and fuel consumption will be average!");
        } else if (engineCapacity > mediumСubicEngine || engineCapacity <= highCapasities) {
            System.out.println("Maximum speed and fuel consumption will be high");
        } else {
            System.out.println("This engine size does not exist!");
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motorcycle{");
        sb.append("stroller=").append(stroller);
        sb.append(", engineCapacity=").append(engineCapacity);
        sb.append('}');
        return sb.toString();
    }

    class LandingType {

        final int landingTypeSport = 1;
        final int landingTypeClassic = 2;
        final int landingTypeCheper = 3;

        int landingType;

        LandingType(int landingType) {
            this.landingType = landingType;
        }

        void discriptionOfLandingTypes(int landingType) {
            if (landingType == landingTypeSport) {
                System.out.println("Body tilted fully forward, legs back!");
            } else if (landingType == landingTypeClassic) {
                System.out.println("Landing is straight, legs are straight!");
            } else if (landingType == landingTypeCheper) {
                System.out.println("Landing straight, legs forward, arms wide apart!");
            } else {
                System.out.println("There is no such landing!");
            }
        }

        public int getLandingType() {
            return landingType;
        }

        public void setLandingType(int landingType) {
            this.landingType = landingType;
        }
    }
}

