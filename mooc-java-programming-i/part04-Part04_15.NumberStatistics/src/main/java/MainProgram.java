
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics numbersSum = new Statistics();
        Statistics numbersEven = new Statistics();
        Statistics numbersOdd = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int userIn = Integer.valueOf(scanner.nextLine());
            if (userIn == -1)
                break;
            if (userIn % 2 == 0)
                numbersEven.addNumber(userIn);   
            else
                numbersOdd.addNumber(userIn);

            numbersSum.addNumber(userIn);
        }
        System.out.println("Sum: " + numbersSum.sum());
        System.out.println("Sum of even numbers: " + numbersEven.sum());
        System.out.println("Sum of odd numbers: " + numbersOdd.sum());
    }
}
