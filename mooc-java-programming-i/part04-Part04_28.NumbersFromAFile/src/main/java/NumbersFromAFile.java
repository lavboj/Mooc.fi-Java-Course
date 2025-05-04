
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner fileRead = new Scanner(Paths.get(file))) {
            int counter = 0;
            while (fileRead.hasNextLine()) {
                int number = Integer.valueOf(fileRead.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
