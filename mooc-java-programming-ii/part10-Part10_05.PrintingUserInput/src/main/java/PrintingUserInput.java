
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        
        while (true) {
            String userIn = scanner.nextLine();
            if (userIn.isEmpty()) {
                break;
            }
            words.add(userIn);
        }
        
        words.stream()
            .forEach(word -> System.out.println(word));
    }
}
