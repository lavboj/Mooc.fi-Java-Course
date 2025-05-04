
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you? ");
        int userIn = Integer.valueOf(scan.nextLine());

        if (userIn >= 0 &&  userIn <= 120) {
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}
