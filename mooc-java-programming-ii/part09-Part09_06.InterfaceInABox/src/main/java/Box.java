import java.util.ArrayList;

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item.weight() + this.weight() > this.maxCapacity) {
            return;
        }
        this.items.add(item);
    }

    public double weight() {
        if (items.isEmpty()) {
            return 0;
        }

        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }

        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
