/*
    Job of ParkingLot -
        It should park a car
 */

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> cars;
    private int size;

    private ParkingLot(int size) {
        this.size = size;
        cars = new ArrayList<>();
    }

    public static ParkingLot create(int size) throws NegativeNumberException {
        if (size < 0)
            throw new NegativeNumberException();
        return new ParkingLot(size);
    }

    public boolean park(Car car) {
        return isEnoughSpacePresent() && cars.add(car);
    }

    private boolean isEnoughSpacePresent() {
        return cars.size() < size;
    }

    public boolean isFilledBy(double filledBy) {
        return cars.size() > size * filledBy;
    }
}
