package attractions;

import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public abstract class Attraction implements IReviewed {
    private String name;
    private int rating;
    private int visitCount;
    private double price;


    ArrayList<Visitor> listOfVisitors;

    public Attraction(String name, int rating, double price) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public int getVisitCount() {
        return this.visitCount;
    }

    public double getPrice(){
        return this.price;
    }



}
