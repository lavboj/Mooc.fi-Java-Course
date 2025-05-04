
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            String userIn = scanner.nextLine();
            if (Integer.valueOf(userIn) < 0) {
                break;
            }
            numbers.add(Integer.valueOf(userIn));
        }
        numbers.stream()
            .filter(n -> n <= 5 && n >= 1)
            .forEach(n -> System.out.println(n));
    }
}
