
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userIn = scanner.nextLine();

        try (Scanner fileIn = new Scanner(Paths.get(userIn))) {
            while (fileIn.hasNextLine()) {
                System.out.println(fileIn.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
