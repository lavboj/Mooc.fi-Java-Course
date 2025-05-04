
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> age = new ArrayList<>();
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String [] array = input.split(",");
            age.add(Integer.valueOf(array[1]));
        }
        for (Integer integer : age) {
            if (integer > oldest) {
                oldest = integer;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
