import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GuestTest {

    private Guest guest;

    @Before
    public void setUp() throws Exception {
        guest = new Guest();
    }

    @Test
    public void guestStartsWithFunds() {
        assertEquals(50, guest.getFunds());
    }

    @Test
    public void guestCanMakePayment__true() {
        assertTrue(guest.makePayment(30));
        // Rate deducted from guest.
        assertEquals(20, guest.getFunds());
    }

    @Test
    public void guestCanMakePayment__false() {
        assertFalse(guest.makePayment(60));
        // Rate not deducted from guest.
        assertEquals(50, guest.getFunds());
    }

}
