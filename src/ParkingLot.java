import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> cars;
    public ParkingLot() {
        cars = new ArrayList<>();
    }

    public boolean park(Car car) {
        return cars.add(car);
    }
}
