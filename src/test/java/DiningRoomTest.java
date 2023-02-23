import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    public DiningRoom diningRoom1;

    @Before
    public void before() {
        diningRoom1 = new DiningRoom("Fancy Food Room", 15);
    }

    @Test
    public void canGetName() {
        assertEquals("Fancy Food Room", diningRoom1.getName());
    }
}
