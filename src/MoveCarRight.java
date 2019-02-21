
/**
 *  MoveCarRight class implements Command interface.
 */
public class MoveCarRight implements Command {

    private Car car;

    /**
     * Constructor for easier initialization.
     * @param car Device object.
     */
    public MoveCarRight(Car car){
        this.car = car;
    }

    /**
     * Execute device's moveBackward command.
     */
    @Override
    public void execute() {
        car.moveRight();
    }
}
