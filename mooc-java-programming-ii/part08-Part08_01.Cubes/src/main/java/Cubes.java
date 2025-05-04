
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userIn = scanner.nextLine();
            if (userIn.equals("end")) {
                break;
            }
            System.out.println(cube(Integer.valueOf(userIn)));
        }
    }

    public static int cube(int number) {
        return number * number * number;
    }
}
