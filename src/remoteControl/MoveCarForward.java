package remoteControl;

import carInterface.Car;

/**
 *  remoteControl.MoveCarForward class implements remoteControl.Command interface.
 */
public class MoveCarForward implements Command {

    private Car car;

    /**
     * Constructor for easier initialization.
     * @param car Device object.
     */
    public MoveCarForward(Car car){
        this.car = car;
    }

    /**
     * Execute device's moveBackward command.
     */
    @Override
    public void execute() {
        car.moveForward();
    }
}
