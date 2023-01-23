package stalls;

import behaviours.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

    public int getMainRating(){
        return this.rating;
    }


}
