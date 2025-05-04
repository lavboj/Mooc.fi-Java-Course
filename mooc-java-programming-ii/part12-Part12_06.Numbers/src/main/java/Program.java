
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomN = new Random();
        int userIn = 0;
        System.out.println("How many random numbers should be printed?");
        try {
            userIn = Integer.valueOf(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Need to be integer");
        }

        for (int i = 0; i < userIn; i++) {
            System.out.println(randomN.nextInt(11));
        }
    }

}
