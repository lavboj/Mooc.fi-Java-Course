
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String userIn = scan.nextLine();

        if (userIn.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
