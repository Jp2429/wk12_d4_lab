import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(20, "CodeClan Main Room");
    }

    @Test
    public void canGetName() {
        assertEquals("CodeClan Main Room", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(20, conferenceRoom.getCapcity());
    }
}
