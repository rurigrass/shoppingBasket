import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Basket {

    private ArrayList<Item> basketList;
    private Item item;
    private Customer customer;

    public Basket() {
        this.basketList = new ArrayList<>();
        this.customer = new Customer(true);
    }

    public int countItems() {
        return this.basketList.size();
    }

    public void addItem(Item item) {
        this.basketList.add(item);
    }


    public void removeItem(Item item) {
        this.basketList.remove(item);
    }

    public void removeAllItems() {
        this.basketList.clear();
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Item item : basketList){
            totalValue += item.getValue();
        }
         return totalValue;
    }

//    public void bogof() {
//        ArrayList<Item> bogofList = new ArrayList<>();
//        for (Item item : basketList) {
//            if (item.getBogof())  { bogofList.add(item);
//            }
//            Collections.sort(bogofList);
//            for (Item item : bogofList) {
//
//
//
//            }
//        }
//    }

    public double getTenPercentDiscount() {
        double discount = this.getTotalValue() / 10.0;
        if (this.getTotalValue() >= 20.0) {
            return this.getTotalValue() - discount;
        }
       else return this.getTotalValue();
    }


    public double getLoyaltyCardDiscount() {
        double discount = this.getTotalValue() / 20.0;
        if (customer.getLoyaltyCard() == true) {
            return this.getTotalValue() - discount;
        } else return  this.getTotalValue();
    }
}
