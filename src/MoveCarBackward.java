
/**
 *  MoveCarBackward class implements Command interface.
 */
public class MoveCarBackward implements Command {

    private Car car;

    /**
     * Constructor for easier initialization.
     * @param car Device object.
     */
    public MoveCarBackward(Car car){
        this.car = car;
    }

    /**
     * Execute device's moveBackward command.
     */
    @Override
    public void execute() {
        car.moveBackward();
    }
}
