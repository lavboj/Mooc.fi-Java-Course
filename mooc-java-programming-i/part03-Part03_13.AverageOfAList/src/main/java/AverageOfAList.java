
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        int sum = 0;

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            int userIn = Integer.valueOf(scanner.nextLine());
            if (userIn == -1) {
                break;
            }
            numbers.add(userIn);
        }
        for (Integer integer : numbers) {
            sum += integer;
        }
        System.out.println("Average: " + (1.0 * sum / numbers.size()));
    }
}
