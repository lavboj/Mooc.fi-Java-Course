
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avg = 0;
        int counter = 0;
        while (true) {
            int userIn = Integer.valueOf(scanner.nextLine());
            if (userIn == 0) {
                break;
            }else if (userIn > 0) {
                avg += userIn;
                counter++;
            }
        }
        if (avg != 0) {
            System.out.println((double) avg / counter);
        }else if (avg == 0) {
            System.out.println("Cannot calculate the average");   
        }

    }
}
