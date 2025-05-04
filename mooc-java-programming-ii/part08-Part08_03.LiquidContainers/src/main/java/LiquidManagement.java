public class LiquidManagement {
    private int first;
    private int second;

    public LiquidManagement() {
        this.first = 0;
        this.second = 0;
    }
    
    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }
     
    public void addLiquid(int amount) {
        if (amount > 0) {
            this.first += amount;
        }
        if (this.first > 100) {
            this.first = 100;
        }
    }

    public void moveLiquid(int amount) {
        if (amount > 0 && amount <= this.first) {
            this.second += amount;
            this.first -= amount;
        }else if (amount > 0 && amount > this.first) {
            this.second += this.first;
            this.first -= amount;
        }
        if (this.first < 0) {
            this.first = 0;
        }
        if (this.second > 100) {
            this.second = 100;
        }
    }

    public void removeLiquid(int amount) {
        if (amount > 0) {
            this.second -= amount;
        }
        if (this.second < 0) {
            this.second = 0;
        }
    }
}
