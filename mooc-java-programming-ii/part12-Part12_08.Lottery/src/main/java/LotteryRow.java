
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>(7);
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random random = new Random();
        int numberR = 0;
        for (int i = 0; i < 7; i++) {
            while (true) {
                numberR = random.nextInt(40) + 1;
                if (!this.containsNumber(numberR)) {
                    break;
                }
            }
            this.numbers.add(numberR);
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }else return false;
    }
}

