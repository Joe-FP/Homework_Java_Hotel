import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void setUp() throws Exception {
        diningRoom = new DiningRoom(15, 50, 6);
    }
    @Test
    public void hasSeats() {
        assertEquals(6, diningRoom.getNumberOfSeats());
    }
}
