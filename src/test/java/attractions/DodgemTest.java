package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        visitor1 = new Visitor(10, 150, 20);
        visitor2 = new Visitor(15, 170, 30);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.0);
    }

    @Test
    public void getHalfPriceDueToAge(){
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.0);
    }

}
