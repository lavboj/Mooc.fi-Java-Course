import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        UserInterface ui = new UserInterface(fileName, scanner);
        ui.start();
    }

}
