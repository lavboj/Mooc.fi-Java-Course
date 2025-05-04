
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int userIn = Integer.valueOf(scan.nextLine());

        if (userIn < 0 ) {
            System.out.println("Grade: impossible!");
        }else if (userIn >= 0 && userIn <= 49) {
            System.out.println("Grade: failed");
        }else if (userIn >= 50 && userIn <= 59){
            System.out.println("Grade: 1");
        }else if (userIn >= 60 && userIn <= 69) {
            System.out.println("Grade: 2");
        }else if (userIn >= 70 && userIn <= 79) {
            System.out.println("Grade: 3");
        }else if (userIn >= 80 && userIn <= 89) {
            System.out.println("Grade: 4");
        }else if (userIn >= 90 && userIn <= 100) {
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");
        }

    }
}
