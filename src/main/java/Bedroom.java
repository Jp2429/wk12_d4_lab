public class Bedroom extends Room {

    private RoomType roomType;
    private double nightlyRate;

    public Bedroom (RoomType roomType, double nightlyRate) {
        super(roomType.getCapacity());
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
