import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private int funds;

    public Hotel(){
        rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public void checkInGuest(Guest guest, Room room){

        boolean paymentMade = guest.makePayment(room.getRate());
        boolean paymentReceived = this.receivePayment((room.getRate()));

        if(paymentMade){
            if(paymentReceived){
                room.checkIn(guest);
            }
            else{
                // hotel error receiving payment
            }
        }
        else{
            // guest error paying
        }
    }

    public void checkOutGuest(Guest guest, Room room){
        room.checkOut(guest);
    }

    public boolean receivePayment(int amount){
        // Assume hotel always receives payment
        funds += amount;
        return true;
    }

    public int roomCount(){
        return this.rooms.size();
    }

    public int getFunds() {
        return funds;
    }

    public void listAllGuests() {
        java.util.Date date = new java.util.Date();
        System.out.println(date + "\n");
        for(Room room : rooms){
            room.showGuestList();
        }
        System.out.println("\n\n\n");
    }
}
