import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> ownings;

    public IOU() {
        this.ownings = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.ownings.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.ownings.getOrDefault(toWhom, 0.0);
    }
}
