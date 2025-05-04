import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> status;

    public ChangeHistory() {
        this.status = new ArrayList<>();
    }

    public void add(double status) {
        this.status.add(status);
    }

    public void clear() {
        this.status.clear();
    }

    @Override
    public String toString() {
        return this.status.toString();
    }

    public double maxValue() {
        if (this.status.isEmpty()) {
            return 0;
        }

        double maxValue = this.status.get(0);

        for (Double value : status) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public double minValue() {
        if (this.status.isEmpty()) {
            return 0;
        }

        double minValue = this.status.get(0);

        for (Double value : status) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public double average() {
        if (this.status.isEmpty()) {
            return 0;
        }

        double avg = 0;

        for (Double value : status) {
            avg += value;
        }

        return avg / this.status.size();
    }
}
