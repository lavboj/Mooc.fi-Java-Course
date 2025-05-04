import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        int suitCompare = Integer.compare(o1.getSuit().ordinal(), o2.getSuit().ordinal());
        if (suitCompare != 0) {
            return suitCompare;
        }
        return Integer.compare(o1.getValue(), o2.getValue());
    }

}
