/*
    Job of ParkingLots
        Add new parking lot
        Park a car at a specific parking lot
 */
import java.util.ArrayList;

public class ParkingLots {
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public boolean add(ParkingLot parkingLot) {
        return parkingLots.add(parkingLot);
    }

    public boolean park(Car car, int indexOfParkingLot) {
        return isValidIndex(indexOfParkingLot) && parkingLots.get(indexOfParkingLot).park(car);
    }

    private boolean isValidIndex(int indexOfParkingLot) {
        return indexOfParkingLot < parkingLots.size();
    }

    public boolean isFilledBy(double filledBy, int indexOfParkingLot) {
        return parkingLots.get(indexOfParkingLot).isFilledBy(filledBy);
    }
}
