
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String userIn = scanner.nextLine();
            if (userIn.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(userIn));
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userIn = scanner.nextLine();
        
        if (userIn.equals("n")) {
            double avg = numbers.stream()
                .mapToInt(n -> n)
                .filter(n -> n < 0)
                .average()
                .getAsDouble();

            System.out.println("Average of the negative numbers: " + avg);
            
        }else if (userIn.equals("p")) {
            double avg = numbers.stream()
                .mapToInt(n -> n)
                .filter(n -> n > 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + avg);
        }
    }
}
