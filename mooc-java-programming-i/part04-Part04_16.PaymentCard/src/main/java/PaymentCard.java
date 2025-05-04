public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60; 
        }
    }

    public void addMoney(double money) {
        if (money < 0) {
            return;
        }else if (this.balance + money <= 150) {
            this.balance += money;
        }else{
            this.balance = 150;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
