
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for? ");
        String input = scanner.nextLine();
        if (list.contains(input)) {
            System.out.println(input + " was found!");
        }else{
            System.out.println(input + " was not found!");
        }
    }
}
