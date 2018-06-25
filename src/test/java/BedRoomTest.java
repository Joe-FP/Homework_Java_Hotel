import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    ConferenceRoom conferenceRoom;
    BedRoom bedRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp(){
        bedRoom = new BedRoom(20, 45, BedroomType.SINGLE, 3);
        conferenceRoom = new ConferenceRoom(20, 150, "CodeClan");
        guest1 = new Guest();
        guest2 = new Guest();
    }
    @Test
    public void hasArea() {
        assertEquals(20, bedRoom.getArea());
    }
    @Test
    public void hasRate() {
        assertEquals(45, bedRoom.getRate());
    }
    @Test
    public void hasType() {
        assertEquals(BedroomType.SINGLE, bedRoom.getType());
    }
    @Test
    public void hasNumber() {
        assertEquals(3, bedRoom.getNumber());
    }
    @Test
    public void canCheckInGuest() {
        bedRoom.checkIn(guest1);
        assertEquals(1, bedRoom.getGuestCount());
    }
    @Test
    public void canCheckOutGuest() {
        bedRoom.checkIn(guest1);
        bedRoom.checkOut(guest1);
        assertEquals(0, bedRoom.getGuestCount());
    }
}
