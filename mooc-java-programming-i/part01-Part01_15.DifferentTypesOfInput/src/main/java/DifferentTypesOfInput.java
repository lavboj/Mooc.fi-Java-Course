
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String userInS = scan.nextLine();
        System.out.println("Give an integer:");
        int userInI = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double userInD = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean userInB = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + userInS);
        System.out.println("You gave the integer " + userInI);
        System.out.println("You gave the double " + userInD);
        System.out.println("You gave the boolean " + userInB);

    }
}
