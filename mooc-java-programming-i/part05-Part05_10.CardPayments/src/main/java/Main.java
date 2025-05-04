
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        PaymentCard yura = new PaymentCard(100);
        unicafeExactum.eatAffordably(yura);

        System.out.println(yura.balance());
    }
}

