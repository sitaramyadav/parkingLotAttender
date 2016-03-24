import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParkingLotsTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldBeAbleToCreateNewParkingLot() throws NegativeNumberException {
        ParkingLots parkingLots = new ParkingLots();
        assertTrue(parkingLots.add(ParkingLot.create(3)));
    }

    @Test
    public void shouldBeAbleToParkACarToASpecificParkingLot() throws NegativeNumberException {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.create(3));
        parkingLots.add(ParkingLot.create(3));
        parkingLots.add(ParkingLot.create(3));
        assertTrue(parkingLots.park(new Car(),0));
    }

    @Test
    public void shouldNotBeAbleToParkACarIfLocationIsEmpty() throws NegativeNumberException {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.create(3));
        parkingLots.add(ParkingLot.create(3));
        parkingLots.add(ParkingLot.create(3));
        assertFalse(parkingLots.park(new Car(),3));
    }
}