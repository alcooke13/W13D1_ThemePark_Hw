package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7, 0);
        visitor1 = new Visitor(10, 150, 20);
        visitor2 = new Visitor(16, 165, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void hasPrice(){
        assertEquals(0, playground.getPrice(), 0.0);
    }

    @Test
    public void checkIsAllowedTrue(){
        assertEquals(true, playground.isAllowed(visitor1));
    }

    @Test
    public void checkIsAllowedFalse(){
        assertEquals(false, playground.isAllowed(visitor2));
    }

}
