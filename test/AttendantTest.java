import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AttendantTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldAbleToParkACarInParkingLots() throws NegativeNumberException {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.create(3));
        parkingLots.add(ParkingLot.create(3));
        parkingLots.add(ParkingLot.create(3));
        Attendant attendant = new Attendant(parkingLots);
        assertTrue(attendant.park(new Car(),0));
    }

    @Test
    public void shouldBeAbleToAddNewAssistantForObserving() throws NegativeNumberException {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.create(3));
        parkingLots.add(ParkingLot.create(3));
        Attendant attendant = new Attendant(parkingLots);
        Assistant assistant = attendant.addAssistant(0, 0.8);
        Assistant expected = new Assistant(parkingLots);
        assertEquals(expected,assistant);
    }

    @Test
    public void shouldNotAllowToAddAnTranieeToASpecificLotWhenFilledByCertainThreshold() throws NegativeNumberException {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.create(1));
        Attendant attendant = new Attendant(parkingLots);
        attendant.park(new Car(),0);
        thrown.expect(RuntimeException.class);
        attendant.addAssistant(0,0.8);
    }

    @Test
    public void shouldBeAbleToPromoteAParkingLotWhenItIsFilledLessThanOrEqualTo20Percent() throws NegativeNumberException {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.create(1));
        Attendant attendant = new Attendant(parkingLots);
        attendant.park(new Car(),0);
        assertTrue(attendant.isAbleToPromote(0,0.2));
    }
}