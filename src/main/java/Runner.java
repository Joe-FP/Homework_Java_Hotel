class Runner {

    public static void main(String[] args){
        Hotel hotel;
        BedRoom bedRoom;
        ConferenceRoom conferenceRoom;
        DiningRoom diningRoom;
        Guest guest1; Guest guest2; Guest guest3; Guest guest4; Guest guest5;

        // Create hotel + rooms.
        hotel = new Hotel();
        bedRoom = new BedRoom(20, 45, BedroomType.SINGLE, 3);
        diningRoom = new DiningRoom(30, 50, 6);
        conferenceRoom = new ConferenceRoom(50, 150, "CodeClan");

        // Add rooms to hotel.
        hotel.addRoom(bedRoom); hotel.addRoom(diningRoom); hotel.addRoom(conferenceRoom);

        // Create guests.
        guest1 = new Guest(); guest2 = new Guest(); guest3 = new Guest(); guest4 = new Guest(); guest5 = new Guest();

        // Check in guests to rooms.
        hotel.checkInGuest(guest1, bedRoom);
        hotel.checkInGuest(guest2, diningRoom);
        hotel.checkInGuest(guest3, conferenceRoom);
        hotel.checkInGuest(guest4, conferenceRoom);
        hotel.checkInGuest(guest5, conferenceRoom);

        // Get a list of guests in all rooms.
        hotel.listAllGuests();
    }

}
