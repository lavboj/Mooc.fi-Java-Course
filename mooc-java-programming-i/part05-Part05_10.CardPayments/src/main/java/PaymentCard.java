
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        if (increase < 0) {
            return;
        }
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }else {
            return false;
        }
    }
}
