import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room (int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }
    public void addGuest(Guest guestToAdd){
        this.guests.add(guestToAdd);
    }

    public int getCapcity (){
        return this.capacity;
    }

    public int getGuestCount () {
        return this.guests.size();
    }

    public void removeGuest (Guest guest) {
        this.guests.remove(guest);
    }
}
