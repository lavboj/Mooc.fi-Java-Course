
import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidManagement liquidManagement = new LiquidManagement();
        while (true) {
            System.out.println("First: " + liquidManagement.getFirst() + "/100\nSecond: " + liquidManagement.getSecond() + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts[0].equals("add") && parts.length > 1) {
                liquidManagement.addLiquid(Integer.valueOf(parts[1]));
            }else if (parts[0].equals("move") && parts.length > 1) {
                liquidManagement.moveLiquid(Integer.valueOf(parts[1]));
            }else if (parts[0].equals("remove") && parts.length > 1) {
                liquidManagement.removeLiquid(Integer.valueOf(parts[1]));
            }
        }
    }
}
