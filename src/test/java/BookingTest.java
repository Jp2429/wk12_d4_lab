import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(RoomType.DOUBLE, 130.00);
        booking1 = new Booking(bedroom1, 5);
    }

    @Test
    public void canGetTotalBill() {
        assertEquals(650, booking1.getTotalBill(), 0.0);
    }



}
