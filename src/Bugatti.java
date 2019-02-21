public class Bugatti implements Car, Cloneable {

    private String horsePower = "1000";
    private String name = "Bugatti Chiron";

    // Variables to count moves
    private int leftRightMovement = 0;
    private int forwardBackwardMovement = 0;

    @Override
    public String getHorsePower() {
        return horsePower;
    }

    @Override
    public String getName() {
        return name;
    }

    public Bugatti() {
    }

    public Bugatti(String horsePower, String name) {
        this.horsePower = horsePower;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Bugatti(horsePower, name);
    }

    @Override
    public String toString() {
        return "Bugatti{" +
                "horsePower='" + horsePower + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Move device left and display result.
     */
    @Override
    public void moveLeft() {
        leftRightMovement++;
        System.out.println("Move car left to " + leftRightMovement);
    }

    /**
     * Move device right and display result.
     */
    @Override
    public void moveRight() {
        leftRightMovement--;
        System.out.println("Move car right to " + leftRightMovement);
    }

    /**
     * Move device forward and display result.
     */
    @Override
    public void moveForward() {
        forwardBackwardMovement++;
        System.out.println("Move car forward to " + forwardBackwardMovement);
    }

    /**
     * Move device backward and display result.
     */
    @Override
    public void moveBackward() {
        forwardBackwardMovement--;
        System.out.println("Move car backward to " + forwardBackwardMovement);
    }
}
