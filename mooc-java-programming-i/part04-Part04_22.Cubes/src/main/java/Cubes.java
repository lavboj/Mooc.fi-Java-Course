
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userIn = scanner.nextLine();
            if (userIn.equals("end")) {
                break;
            }
            System.out.println(Integer.valueOf(userIn) * Integer.valueOf(userIn) * Integer.valueOf(userIn));
        }
    }
}
