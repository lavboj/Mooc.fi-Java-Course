
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int smallest = 0;
        int temp = 0;
        int greatest = 0;

        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            if (temp > greatest) {
                greatest = list.get(i);
            }else if (temp < smallest) {
                smallest = list.get(i);
            }
        }
        System.out.println(smallest);
        System.out.println(greatest);
    }
}
