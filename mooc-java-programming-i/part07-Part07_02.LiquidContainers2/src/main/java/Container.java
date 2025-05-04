public class Container {
    private int amountLiquid;
    private final int MAX_STORAGE = 100;

    public Container() {
        this.amountLiquid = 0;
    }

    public int contains() {
        return this.amountLiquid;
    }

    public void add(int amountLiquid) {
        if (amountLiquid < 0) {
            return;
        }

        this.amountLiquid += amountLiquid;

        if (this.amountLiquid > MAX_STORAGE) {
            this.amountLiquid = 100;
        }
    }

    public void remove(int amountLiquid) {
        if (amountLiquid < 0) {
            return;
        }

        this.amountLiquid -= amountLiquid;

        if (this.amountLiquid < 0) {
            this.amountLiquid = 0;
        }
    }

    public String toString() {
        return contains() + "/100";
    }
}
