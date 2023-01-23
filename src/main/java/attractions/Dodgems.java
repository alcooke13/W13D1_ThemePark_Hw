package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating, double price) {
        super(name, rating, price);
    }


    public double defaultPrice() {
        return this.getPrice();
    }


    public double priceFor(Visitor visitor) {
        int ageThreshold = 12;
        if(visitor.getAge() < ageThreshold){
            return defaultPrice() / 2;
        }else{
            return defaultPrice();
        }
    }


}
