
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int value = 0;
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            String [] parts = input.split(" ");
            String command = parts[0];
            if (parts.length > 1 ) {
                value = Integer.valueOf(parts[1]);
            }
            
            if (command.equals("quit")) {
                break;
            }else if (command.equals("add")) {
                if (value < 0) {
                    continue;
                }

                first += value;
                if (first > 100) {
                    first = 100;
                }

            }else if (command.equals("move")) {
                if (value < 0 || first == 0) {
                    continue;
                }

                if (value > first) {
                    second += first;
                    first = 0;
                }else {
                    second += value;
                    first -= value;
                }

                if (second > 100) {
                    second = 100;
                }

            }else if (command.equals("remove")) {
                if (value < 0 || second == 0) {
                    continue;
                }

                if (value > second) {
                    second = 0;
                }else {
                    second -= value;
                }
            }
        }
    }

}
