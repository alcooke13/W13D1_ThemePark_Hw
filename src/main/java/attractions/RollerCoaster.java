package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

import java.util.ArrayList;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {
    private Visitor visitor;
    private ArrayList<Visitor> listOfVisitors;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating, price);
        this.listOfVisitors = new ArrayList<Visitor>();

    }

    public boolean isAllowed(Visitor visitor){
        int minimumAge = 12;
        int minimumHeight = 145;
        return visitor.getAge() > minimumAge && visitor.getHeight() > minimumHeight;
    }

    public void addVisitorToAttraction(Visitor visitor){
        if (this.isAllowed(visitor)){
            this.listOfVisitors.add(visitor);
        }
    }

    public int countListOfVisitors(){
        return this.listOfVisitors.size();
    }

    public double defaultPrice() {
        return this.getPrice();
    }

    public double priceFor(Visitor visitor) {
        int heightThreshold = 200;
        if(visitor.getHeight() >= heightThreshold){
            return this.defaultPrice() * 2;
        }else{
            return defaultPrice();
        }
    }
}
