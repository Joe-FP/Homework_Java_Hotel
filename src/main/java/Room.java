import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {

    private int area;
    private int rate;
    private ArrayList<Guest> guests;

    public Room(int area, int rate) {
        this.area = area;
        this.rate = rate;
        guests = new ArrayList<Guest>();
    }

    public int getArea() {
        return this.area;
    }

    public int getRate() {
        return this.rate;
    }

    public void checkIn(Guest guest){
        this.guests.add(guest);
    }

    public void checkOut(Guest guest){
        this.guests.remove(guest);
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void showGuestList(){
        Class<?> enclosingClass = getClass();
        System.out.println("Guests in the " + enclosingClass.getName() + ": " + this.getGuestCount());
    }

}