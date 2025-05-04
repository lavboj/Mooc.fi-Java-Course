import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public String toString() {
        String string = "";
        for (Movable organism : herd) {
            string += "\n" + organism.toString();
        }
        return string;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : herd) {
            organism.move(dx, dy);
        }
    }
}
