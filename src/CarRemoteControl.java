
/**
 * CarRemoteControl as invoker.
 */
public class CarRemoteControl {

    private Command command;

    /**
     * Constructor for easier initialization.
     * @param command Command object.
     */
    public CarRemoteControl(Command command){
        this.command = command;
    }

    /**
     * Calls Command object method execute.
     */
    public void pressButton(){
        command.execute();
    }

}
