import java.util.ArrayList;

/*
    JOb Of Attendant
        Park a car in parking lots
 */
public class Attendant {
    protected ParkingLots parkingLots;
    private ArrayList<Assistant> assistants;

    public Attendant(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
        assistants = new ArrayList<>();
    }

    public boolean park(Car car, int indexOfParkingLot) {
        return parkingLots.park(car,indexOfParkingLot);
    }

    public Assistant addAssistant(int indexOfParkingLot, double threshold) {
        if(isFilledBy(indexOfParkingLot, threshold))
            throw new RuntimeException();
        Assistant assistant = new Assistant(parkingLots);
        assistants.add(assistant);
        return assistant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attendant attendant = (Attendant) o;

        if (parkingLots != null ? !parkingLots.equals(attendant.parkingLots) : attendant.parkingLots != null)
            return false;
        return assistants != null ? assistants.equals(attendant.assistants) : attendant.assistants == null;

    }

    public boolean isAbleToPromote(int indexOfParkingLot, double threshold) {
        return isFilledBy(indexOfParkingLot, threshold);
    }

    private boolean isFilledBy(int indexOfParkingLot, double threshold) {
        return parkingLots.isFilledBy(threshold,indexOfParkingLot);
    }
}
