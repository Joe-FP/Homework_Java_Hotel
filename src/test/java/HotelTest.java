import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedRoom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        // Create hotel + rooms.
        hotel = new Hotel();
        bedRoom = new BedRoom(20, 45, BedroomType.SINGLE, 3);
        diningRoom = new DiningRoom(30, 50, 6);
        conferenceRoom = new ConferenceRoom(50, 150, "CodeClan");
        // Create a guest.
        guest1 = new Guest();
        guest2 = new Guest();
    }
    @Test
    public void canAddRooms() {
        // Add the rooms to the hotel.
        hotel.addRoom(bedRoom);
        assertEquals(1, hotel.roomCount());
    }
    @Test
    public void canCheckInGuestToRoom__true() {
        hotel.checkInGuest(guest1, diningRoom);
        assertEquals(1, diningRoom.getGuestCount());
        assertEquals(50, hotel.getFunds());
    }

    @Test
    public void canCheckInGuestToRoom__false() {
        hotel.checkInGuest(guest1, conferenceRoom);
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canCheckOutGuestFromRoom() {
        hotel.checkInGuest(guest1, diningRoom);
        hotel.checkOutGuest(guest1, diningRoom);
        assertEquals(0, diningRoom.getGuestCount());
    }

}
