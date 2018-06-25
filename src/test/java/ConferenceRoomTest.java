import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom(20, 150, "CodeClan");
    }
    @Test
    public void hasName() {
        assertEquals("CodeClan", conferenceRoom.getName());
    }
}

