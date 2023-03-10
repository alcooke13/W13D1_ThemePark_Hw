package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }


    public boolean isAllowed(Visitor visitor) {
        int minimumAge = 18;
            return visitor.getAge() >= minimumAge;
    }

    public int getRating() {
        return this.getMainRating();
    }
}
