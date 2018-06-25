public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int area, int rate, String name) {
        super(area, rate);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
