import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before() {
        this.item = new Item("bag", 10, true);
    }

    @Test
    public void canGetItemName() {
        assertEquals("bag", item.getName());
    }

    @Test
    public void canGetItemValue() {
        assertEquals(10, item.getValue(), 0.1);
    }

    @Test
    public void canGetBogof() {
        assertEquals(true, item.getBogof());
    }






}
