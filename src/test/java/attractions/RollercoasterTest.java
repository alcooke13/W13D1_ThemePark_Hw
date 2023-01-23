package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private RollerCoaster rollerCoaster;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;
    private Visitor visitor4;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor1 = new Visitor(10, 150, 20);
        visitor2 = new Visitor(16, 165, 40);
        visitor3 = new Visitor(17, 210, 50);
        visitor4 = new Visitor(19, 130, 50);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasPrice(){
        assertEquals(8.40, rollerCoaster.getPrice(), 0.0);
    }

    @Test
    public void rollercoasterStartsEmpty(){
        assertEquals(0, rollerCoaster.countListOfVisitors());
    }

    @Test
    public void checkVisitorIsAllowedTrue(){
        assertEquals(true, rollerCoaster.isAllowed(visitor2));
    }

    @Test
    public void checkVisitorIsAllowedFalseDueHeight(){
        assertEquals(false, rollerCoaster.isAllowed(visitor4));
    }

    @Test
    public void checkVisitorIsAllowedFalseDueAge(){
        assertEquals(false, rollerCoaster.isAllowed(visitor1));
    }

    @Test
    public void canAddVisitorToRollercoaster(){
        rollerCoaster.addVisitorToAttraction(visitor2);
        assertEquals(1, rollerCoaster.countListOfVisitors());
    }

    @Test
    public void addsOnlyOneVisitorToRollerCoaster(){
        rollerCoaster.addVisitorToAttraction(visitor1);
        rollerCoaster.addVisitorToAttraction(visitor2);
        rollerCoaster.addVisitorToAttraction(visitor3);
        assertEquals(2, rollerCoaster.countListOfVisitors());
    }

    @Test
    public void getsDefaultPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.0);
    }

    @Test
    public void getsDoublePriceDueToVisitorHeight(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.0);
    }

}
