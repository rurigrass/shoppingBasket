import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> basketList;
    private Item item;

    public Basket() {
        this.basketList = new ArrayList<>();
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
//            for (Item item : bogofList) {
//
//            }
//        }
//
//    }

    public double getTenPercentDiscount() {
        double discount = this.getTotalValue() / 10.0;
        if (this.getTotalValue() >= 20.0) {
            return this.getTotalValue() - discount;
        }
       else return this.getTotalValue();
    }



}
