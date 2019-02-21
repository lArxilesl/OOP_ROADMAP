import convertor.HorsePowerConvertorAdapter;
import itarator.Iterator;
import modelsOfCar.Bugatti;
import modelsOfCar.Ferrari;
import modelsOfCar.Lamborghini;
import modelsOfCar.MercedesBenz;
import remoteControl.CarRemoteControl;
import remoteControl.MoveCarForward;
import repository.CarRepository;
import repository.Garage;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Main main = new Main();

        /* main.testCommand();
           main.testAdapter();
           main.testIntarator();
           main.testComposite();
           main.testPrototype();
        */











    }

    void testCommand() {

        Ferrari ferrari = new Ferrari();
        MoveCarForward moveCarForward = new MoveCarForward(ferrari);
        CarRemoteControl carRemoteControl  = new CarRemoteControl(moveCarForward);
        carRemoteControl.pressButton();


    }

    void testPrototype() throws CloneNotSupportedException {
        Ferrari ferrari1 = new Ferrari();
        Ferrari ferrari2 = (Ferrari) ferrari1.clone();
        Ferrari ferrari3 = (Ferrari) ferrari1.clone();
    }

    void testAdapter(){
        Ferrari ferrari = new Ferrari();
        HorsePowerConvertorAdapter horsePowerConvertorAdapter = new HorsePowerConvertorAdapter(ferrari);  //Adapter begin    TODO
        System.out.println(horsePowerConvertorAdapter.getKiloWatt());
    }

    void testIntarator(){

        CarRepository carRepository = new CarRepository();

        Iterator iterator = carRepository.getIterator();

        // itarator.Iterator output.
        while (iterator.hasNext()) {
            System.out.println("carInterface.Car make = " + iterator.next());
        }
    }

    void testComposite(){
        // Initialize different modelOfCar.Ferrari objects
        Ferrari ferrari1 = new Ferrari();
        Ferrari ferrari2 = new Ferrari();
        Ferrari ferrari3 = new Ferrari();

        // Initialize different modelOfCar.MercedesBenz objects
        MercedesBenz mercedesBenz1 = new MercedesBenz();
        MercedesBenz mercedesBenz2 = new MercedesBenz();

        // Initialize different modelOfCar.Bugatti objects
        Bugatti bugatti1 = new Bugatti();

        // Initialize different modelOfCar.Lamborghini objects
        Lamborghini lamborghini1 = new Lamborghini();
        Lamborghini lamborghini2 = new Lamborghini();

        // Initializes repository.Garage objects
        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        // Add different objects to garage1
        garage1.addCar(ferrari1);
        garage1.addCar(ferrari2);
        garage1.addCar(mercedesBenz1);
        garage1.addCar(lamborghini1);

        // Add different objects to garage2
        garage2.addCar(ferrari3);
        garage2.addCar(mercedesBenz2);
        garage2.addCar(bugatti1);
        garage2.addCar(lamborghini2);

        //Output result
        System.out.println("All Cars");
        garage1.getName();
        System.out.println();

        //Removing one record from composite
        garage1.removeFile(ferrari2);

        //Output result
        System.out.println("All cars after removing ferrari2 from garage1");
        garage1.getName();
    }
}
