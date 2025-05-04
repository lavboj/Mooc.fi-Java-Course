import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item itemWeight : this.items) {
            totalWeight += itemWeight.getWeight();
        }
        if (maximumWeight - totalWeight >= item.getWeight()) {
            this.items.add(item); 
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (heaviest.getWeight() <= item.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }

        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight + " kg)";  
        }
        return items.size() + " items (" + totalWeight + " kg)";  
    }
}
