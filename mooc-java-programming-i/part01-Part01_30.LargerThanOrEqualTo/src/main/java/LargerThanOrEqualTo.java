
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstIn = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondIn = Integer.valueOf(scan.nextLine());

        if (firstIn > secondIn) {
            System.out.println("Greater number is: " + firstIn);
        }else if (secondIn > firstIn){
            System.out.println("Greater number is: " + secondIn);
        }else {
            System.out.println("The numbers are equal!");
        }
    }
}
