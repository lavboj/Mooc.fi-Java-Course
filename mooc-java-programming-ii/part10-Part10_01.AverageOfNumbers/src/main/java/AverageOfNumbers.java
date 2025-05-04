
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String userIn = scanner.nextLine();
            if (userIn.equals("end")) {
                double avg = numbers.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .average()
                    .getAsDouble();

                System.out.println("average of the numbers: " + avg);
                break;
            }

            numbers.add(userIn);

        }
    }
}
