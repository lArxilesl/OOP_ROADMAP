package remoteControl;

/**
 * remoteControl.CarRemoteControl as invoker.
 */
public class CarRemoteControl {

    private Command command;

    /**
     * Constructor for easier initialization.
     * @param command remoteControl.Command object.
     */
    public CarRemoteControl(Command command){
        this.command = command;
    }

    /**
     * Calls remoteControl.Command object method execute.
     */
    public void pressButton(){
        command.execute();
    }

}
