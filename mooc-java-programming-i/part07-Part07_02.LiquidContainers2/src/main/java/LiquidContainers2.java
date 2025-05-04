
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        int value = 0;

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String [] parts = input.split(" ");
            String comand = parts[0];
            if (parts.length > 1) {
                value = Integer.valueOf(parts[1]);
            }
            if (input.equals("quit")) {
                break;
            }else if (comand.equals("add")) {
                first.add(value);
            }else if (comand.equals("remove")) {
                second.remove(value);
            }else if (comand.equals("move")) {
                if (value > first.contains()) {
                    second.add(first.contains());
                    first.remove(value);
                }else {
                    second.add(value);
                    first.remove(value);
                }
            }

        }
    }

}
