
/**
 *  MoveCarLeft class implements Command interface.
 */
public class MoveCarLeft implements Command {

    private Car car;

    /**
     * Constructor for easier initialization.
     * @param car Device object.
     */
    public MoveCarLeft(Car car){
        this.car = car;
    }

    /**
     * Execute device's moveBackward command.
     */
    @Override
    public void execute() {
        car.moveLeft();
    }
}
