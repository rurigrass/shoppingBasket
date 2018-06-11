public class Item {

    private String name;
    private double value;
    private boolean bogof;

    public Item(String name, double value, boolean bogof) {
        this.name = name;
        this.value = value;
        this.bogof = bogof;
    }


    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

    public boolean getBogof() {
        return this.bogof;
    }

}
