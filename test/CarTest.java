import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CarTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldBeAbleToPark() {
        Car car = new Car();
        assertTrue(car.park(new ParkingLot()));
    }
}