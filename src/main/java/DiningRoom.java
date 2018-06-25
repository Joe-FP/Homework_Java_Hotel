public class DiningRoom extends Room{

    private int numberOfSeats;

    public DiningRoom(int area, int rate, int numberOfSeats){
        super(area, rate);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
}
