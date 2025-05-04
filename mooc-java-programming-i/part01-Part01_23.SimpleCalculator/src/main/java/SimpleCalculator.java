
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstN = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondN = Integer.valueOf(scanner.nextLine());

        System.out.println(firstN + " + " + secondN + " = " + (firstN + secondN));
        System.out.println(firstN + " - " + secondN + " = " + (firstN - secondN));
        System.out.println(firstN + " * " + secondN + " = " + (firstN * secondN));
        System.out.println(firstN + " / " + secondN + " = " + (1.0 * firstN / secondN));
    }
}
