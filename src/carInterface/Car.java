package carInterface;

public interface Car {

    String getHorsePower();

    String getName();

    /**
     * Move car left.
     */
    void moveLeft();

    /**
     * Move car right.
     */
    void moveRight();

    /**
     * Move car forward.
     */
    void moveForward();

    /**
     * Move car backward.
     */
    void moveBackward();
}
