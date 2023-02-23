import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private Booking booking1;
    private DiningRoom diningRoom1;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(RoomType.SINGLE, 99.50);
        conferenceRoom1 = new ConferenceRoom(20, "CodeClan Main Room");
        diningRoom1 = new DiningRoom("Fancy Food Room", 15);
        guest1 = new Guest("Dan");
        booking1 = new Booking (bedroom1, 3);
        hotel.addToBedrooms(bedroom1);
        hotel.addToConferenceRooms(conferenceRoom1);
    }

    @Test
    public void canGetBedroomCount() {
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void canGetConferenceRoomCount() {
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void canCheckInToBedroom() {
        Bedroom returnedBedroom = hotel.checkInToBedroom(guest1, bedroom1);
        assertEquals(1, returnedBedroom.getGuestCount());
    }

    @Test
    public void canCheckInToConferenceRoom() {
        ConferenceRoom returnedConferenceRoom = hotel.checkInToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, returnedConferenceRoom.getGuestCount());
    }

    @Test
    public void canCheckOutOfBedroom() {
        Bedroom returnedBedroom = hotel.checkInToBedroom(guest1, bedroom1);
        Bedroom checkedOutBedroom = hotel.checkOutOfBedroom(guest1, bedroom1);
        assertEquals(0, checkedOutBedroom.getGuestCount());
    }

    @Test
    public void canCheckOutOfConferenceRoom() {
        ConferenceRoom returnedConferenceRoom = hotel.checkInToConferenceRoom(guest1, conferenceRoom1);
        ConferenceRoom checkedOutConferenceRoom = hotel.checkOutOfConferenceRoom(guest1, conferenceRoom1);
        assertEquals(0, checkedOutConferenceRoom.getGuestCount());
    }

    @Test
    public void canBookRoom() {
        Booking newBooking = hotel.bookRoom(bedroom1, 3);
        assertEquals(3, newBooking.getNights());
    }

//    @Test
//    public void canAddDiningRoom() {
//        // DiningRoom diningRoom = hotel.addDiningRoom(diningRoom1, guest1);
//        assertEquals(1, diningRoom.getGuestCount());
//    }

    @Test
    public void canAddDiningRoom () {
        hotel.addToDiningRooms(diningRoom1);
        assertEquals(1, hotel.getDiningRoomCount());
    }
}
