
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        UserInterface ui = new UserInterface(scan, first, second);

        while (true) {
            System.out.println("\nFirst: " + first);
            System.out.println("Second: " + second + "\n");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            ui.start(command, amount);
        }
    }
}
