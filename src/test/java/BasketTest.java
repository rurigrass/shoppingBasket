import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;
    Item item1, item2, item3;
    Customer customer;

    @Before
    public void before(){
        basket = new Basket();
        item1 = new Item("bag", 10, true);
        item2 = new Item("shirt", 50, false);
        item3 = new Item("fancy bag", 20, true);
        customer = new Customer(true);
    }

    @Test
    public void canCountItems() {
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item1);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void canRemoveItem() {
        basket.addItem(item1);
        basket.removeItem(item2);
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canRemoveAllItems() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeAllItems();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canGetTotalValue() {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(60, basket.getTotalValue(), 0.1);
    }

//    @Test
//    public void canBogof() {
//        basket.addItem(item1);
//        basket.addItem(item3);
//        assertEquals(20, basket.getTotalValue(), 0.1);
//    }

    @Test
    public void canGetTenPercentDiscount() {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(54, basket.getTenPercentDiscount(), 0.1);
    }

    @Test
    public void canGetLoyaltyCardDiscount() {
        basket.addItem(item1);
        assertEquals(9.5, basket.getLoyaltyCardDiscount(), 0.1);
    }



}
