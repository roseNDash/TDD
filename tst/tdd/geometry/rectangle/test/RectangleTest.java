package tdd.geometry.rectangle.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import tdd.geometry.rectangle.Rectangle;

public class RectangleTest {
    @Test
    public void instantiateWithBadInputs() {
        try {
            new Rectangle(0, 0);
            fail("Exception expected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testArea() {
        Rectangle r = new Rectangle(5, 7);
        r.area();
    }

}
