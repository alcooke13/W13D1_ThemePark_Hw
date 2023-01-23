package attractions;

import behaviours.ISecurity;
import people.Visitor;

import java.util.ArrayList;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating, double price) {
        super(name, rating, price);
        this.listOfVisitors = new ArrayList<Visitor>();
    }

    public boolean isAllowed(Visitor visitor){
        int maximumAge = 15;
        return visitor.getAge() <= maximumAge;
    }
    public void addVisitorToAttraction(Visitor visitor){
        if (this.isAllowed(visitor)){
            this.listOfVisitors.add(visitor);
        }
    }

    public int countListOfVisitors() {
        return this.listOfVisitors.size();
    }
}
