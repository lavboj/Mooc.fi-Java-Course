import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase suitcaseWeight : this.suitcases) {
            totalWeight += suitcaseWeight.totalWeight();
        }
        if (this.maximumWeight - totalWeight >= suitcase.totalWeight()) {
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
