package repository;

import carInterface.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage implements Car {

    /**
     * Composite which could contain different cars.
     */
    private List<Car> carSystem = new ArrayList<>();

    /**
     * Adding objects to Array list.
     * @param car New car to add.
     */
    public void addCar(Car car){
        carSystem.add(car);
    }

    /**
     * Removing objects from Array list.
     * @param car File to remove.
     */
    public void removeFile(Car car){
        carSystem.remove(car);
    }

    @Override
    public String getHorsePower() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - Total price ");
        double price = 0;
        for (Car car : carSystem) {
            price += Double.parseDouble(car.getHorsePower());
        }
        builder.append(price + " - HP");

        return builder.toString();
    }

    @Override
    public String getName() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - Diving into repository.Garage");
        for (Car car : carSystem) {
            builder.append(car.getName());
        }
        builder.append(" - repository.Garage processed");

        return builder.toString();
    }

    /**
     * Move device left and display result.
     */
    @Override
    public void moveLeft() {

    }

    /**
     * Move device right and display result.
     */
    @Override
    public void moveRight() {

    }

    /**
     * Move device forward and display result.
     */
    @Override
    public void moveForward() {

    }

    /**
     * Move device backward and display result.
     */
    @Override
    public void moveBackward() {

    }
}
