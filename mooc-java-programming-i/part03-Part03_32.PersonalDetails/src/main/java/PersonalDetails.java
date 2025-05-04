
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String name = null;
        int sum = 0;
        int i = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String [] array = input.split(",");
            sum += Integer.valueOf(array[1]);
            i++;
            if (array[0].length() > longest) {
                longest = array[0].length();
                name = array[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) sum / i);

    }
}
