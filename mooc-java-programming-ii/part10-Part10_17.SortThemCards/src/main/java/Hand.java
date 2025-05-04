import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.forEach(System.out::println);
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
            .comparing(Card::getValue)
            .thenComparing(Card::getSuit);
        
        Collections.sort(this.hand, comparator);
    }

    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(this.hand, comparator);
    }

    public int getScore() {
        return this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
    }

    @Override
    public int compareTo(Hand o) {
        return this.getScore() - o.getScore();
    }
}
