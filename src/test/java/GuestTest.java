import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before() {
        guest1 = new Guest("Dan");
    }

    @Test
    public void canGetName (){
        assertEquals("Dan", guest1.getName());
    }

}
