package convertor;

import carInterface.Car;

public class HorsePowerConvertorAdapter implements HorsePowerConvertor {

    /**
     * Horse Power convertor, which is wrapped and being adapted.
     */
    Car car;

    /**
     * Constructor with parameter of carInterface.Car object
     * @param car Horse Power convertor.
     */
    public HorsePowerConvertorAdapter(Car car) {
        this.car = car;
    }


    @Override
    public String getKiloWatt() {
        double hp = Double.parseDouble(car.getHorsePower());
        return String.valueOf(hp*1.341);
    }
}
