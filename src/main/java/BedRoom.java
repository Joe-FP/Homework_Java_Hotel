public class BedRoom extends Room {
    // Concrete class based on super class Room.

    //private String type;
    private BedroomType roomType;
    private int roomNumber;

    public BedRoom(int area, int rate, BedroomType roomType, int roomNumber) {
        super(area, rate);
        //this.type = type;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public BedroomType getType() {
        return this.roomType;
    }

    public int getNumber() {
        return this.roomNumber;
    }

}
