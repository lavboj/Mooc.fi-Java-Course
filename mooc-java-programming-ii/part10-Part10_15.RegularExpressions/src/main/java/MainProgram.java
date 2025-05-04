import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker check = new Checker();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userIn = scan.nextLine();
        System.out.println(check.isDayOfWeek(userIn));
        System.out.println(check.allVowels(userIn));
        System.out.println(check.timeOfDay(userIn));
    }
}
