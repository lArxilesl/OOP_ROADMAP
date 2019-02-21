package repository;

import carInterface.Car;
import itarator.Aggregate;
import itarator.Iterator;
import modelsOfCar.Bugatti;
import modelsOfCar.Ferrari;
import modelsOfCar.Lamborghini;
import modelsOfCar.MercedesBenz;

/**
 *  repository.CarRepository class which implements itarator.Aggregate interface.
 */
public class CarRepository implements Aggregate {

    // Array with car makes.
    private Car cars[] = {new Ferrari(), new Bugatti(), new MercedesBenz(), new Lamborghini()};

    /**
     * Gets iterator.
     * @return CarMakeIterator object.
     */
    @Override
    public Iterator getIterator() {
        return new CarMakeIterator();
    }

    /**
     *  CarMakeIterator class which implements itarator.Iterator interface.
     */
    private class CarMakeIterator implements Iterator {

        private int index = 0;

        /**
         * Check if collection contains next value.
         * @return boolean.
         */
        @Override
        public boolean hasNext() {
            if(index < cars.length){
                return true;
            }
            return false;
        }

        /**
         * Returns next value from array.
         * @return String value of car make.
         */
        @Override
        public Object next() {
            return cars[index++];
        }
    }
}