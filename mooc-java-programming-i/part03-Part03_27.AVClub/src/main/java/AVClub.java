
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }   
            String [] parts = input.split(" ");
            for (String string : parts) {
                if (string.contains("av")) {
                    System.out.println(string);
                }
            }
        }

    }
}
