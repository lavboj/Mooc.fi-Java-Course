
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String userIn = scanner.nextLine();
            if (userIn.isEmpty()) {
                break;
            }
            
            String [] words = userIn.split(" ");
            for (String string : words) {
                System.out.println(string);
            }
        }
    }
}
