import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(RoomType.SINGLE, 99.50);
        guest1 = new Guest("Dan");
        bedroom1.addGuest(guest1);
    }

    @Test
    public void canGetRoomType () {
        assertEquals(RoomType.SINGLE, bedroom1.getRoomType());
    }

    @Test
    public void canGetCapacityOfRoom () {
        assertEquals(1, bedroom1.getCapcity());
    }

    @Test
    public void canGetGuestCount () {
        assertEquals(1, bedroom1.getGuestCount());
    }

    @Test
    public void canGetNightlyRate () {
        assertEquals(99.50, bedroom1.getNightlyRate(), 0.0);
    }


}
