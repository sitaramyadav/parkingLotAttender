import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParkingLotTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldBeAbleToParkACar() throws NegativeNumberException {
        ParkingLot parkingLot = ParkingLot.create(3);
        assertTrue(parkingLot.park(new Car()));
    }

    @Test
    public void shouldNotBeAbleToParkACarWhenParkingLotIsFull() throws NegativeNumberException {
        ParkingLot parkingLot = ParkingLot.create(0);
        parkingLot.park(new Car());
        assertFalse(parkingLot.park(new Car()));
    }

    @Test
    public void shouldThrowAnExceptionWhenItGetNegativeSize() throws NegativeNumberException {
        thrown.expect(NegativeNumberException.class);
        ParkingLot.create(-1);
    }
}