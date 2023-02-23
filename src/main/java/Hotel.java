import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel (){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public void addToBedrooms (Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addToConferenceRooms (ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }

    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public Bedroom checkInToBedroom(Guest guest, Bedroom passedInBedroom) {
        for (Bedroom loopedBedroom : this.bedrooms) {
            if (loopedBedroom == passedInBedroom) {
                if (loopedBedroom.getGuestCount() < loopedBedroom.getCapcity()) {
                    loopedBedroom.addGuest(guest);
                    return loopedBedroom;
                }
            }
        }
        return passedInBedroom;
    }

    public ConferenceRoom checkInToConferenceRoom(Guest guest, ConferenceRoom passedInConferenceRoom) {
        for (ConferenceRoom loopedConferenceRoom : this.conferenceRooms) {
            if (loopedConferenceRoom == passedInConferenceRoom) {
                if (loopedConferenceRoom.getGuestCount() < loopedConferenceRoom.getCapcity()) {
                    loopedConferenceRoom.addGuest(guest);
                    return loopedConferenceRoom;
                }
            }
        }
        return passedInConferenceRoom;
    }

    public Bedroom checkOutOfBedroom(Guest guest, Bedroom bedroom) {
        for (Bedroom loopedBedroom : this.bedrooms) {
            if (loopedBedroom == bedroom) {
                if (loopedBedroom.getGuestCount() > 0) {
                    loopedBedroom.removeGuest(guest);
                    return loopedBedroom;
                }
            }
        }
        return bedroom;
    }

    public ConferenceRoom checkOutOfConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        for (ConferenceRoom loopedConferenceRoom : this.conferenceRooms) {
            if (loopedConferenceRoom == conferenceRoom) {
                if (loopedConferenceRoom.getGuestCount() > 0) {
                    loopedConferenceRoom.removeGuest(guest);
                    return loopedConferenceRoom;
                }
            }
        }
        return conferenceRoom;
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking newBooking = new Booking(bedroom, nights);
        return newBooking;
    }

    public void addToDiningRooms(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public int getDiningRoomCount() {
        return this.diningRooms.size();
    }
}
