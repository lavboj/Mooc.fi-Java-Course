
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment <  2.50) {
            return payment;
        }else {
            affordableMeals++;
            money += 2.50;
            return payment - 2.50;
        }
        
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        this.money += sum;
        card.addMoney(sum);
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment <  4.30) {
            return payment;
        }else {
            heartyMeals++;
            money += 4.30;
            return payment - 4.30;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.50) {
            return false;
        }else {
            affordableMeals++;
            card.takeMoney(2.50);
            return true;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.30) {
            return false;
        }else {
            heartyMeals++;
            card.takeMoney(4.30);
            return true;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
