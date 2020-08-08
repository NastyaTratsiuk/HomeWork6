package HomeWork5.MovableObjects;

public class Bicycle implements Movable {

    boolean trunk;
    int frameSize;
    int frameSize1 = 14;
    int frameSize2 = 16;
    int frameSize3 = 18;
    int frameSize4 = 20;

    public Bicycle(boolean trunk, int framSize) {
        this.trunk = trunk;
        this.frameSize = framSize;
    }

    @Override
    public void move() {
        System.out.println("I can moving!");
    }

    public void numberOfSeats(boolean trunk) {
        String numberOfSeats = (trunk == true) ? "Сan carry 2 people!" : "Can carry 1 people!";
        System.out.println(numberOfSeats);
    }

    public void chosingBikeOfHeight(int frameSize) {
        if (frameSize > frameSize1) {
            System.out.println("Children bicycle");
        } else if (frameSize == frameSize1) {
            System.out.println("The bike is suitable for a person's height from 135 to 155 cm.");
        } else if (frameSize == frameSize2) {
            System.out.println("The bike is suitable for a person's height from 150 to 165 cm.");
        } else if (frameSize == frameSize3) {
            System.out.println("The bike is suitable for a person's height from 165 to 175 cm.");
        } else if (frameSize == frameSize4) {
            System.out.println("The bike is suitable for a person's height from 175 and higher. ");
        } else {
            System.out.println("No such frame exists.");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicycle{");
        sb.append("trunk=").append(trunk);
        sb.append(", frameSize=").append(frameSize);
        sb.append('}');
        return sb.toString();
    }

    class speeds {

        private int numberOfChainrings;
        private int numberOfSprockets;

        int numberOfSpeeds(int numberOfSprockets, int numberOfChainrings) {
            int numberOfSpeeds = numberOfSprockets * numberOfChainrings;
            System.out.println(numberOfSpeeds);
            return numberOfSpeeds;
        }

        public int getNumberOfChainrings() {
            return numberOfChainrings;
        }

        public void setNumberOfChainrings(int numberOfChainrings) {
            this.numberOfChainrings = numberOfChainrings;
        }

        public int getNumberOfSprockets() {
            return numberOfSprockets;
        }

        public void setNumberOfSprockets(int numberOfSprockets) {
            this.numberOfSprockets = numberOfSprockets;
        }
    }
}
