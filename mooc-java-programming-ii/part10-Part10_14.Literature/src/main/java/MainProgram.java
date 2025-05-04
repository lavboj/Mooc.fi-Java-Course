
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> inputs = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String userIn = scanner.nextLine();
            if (userIn.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            String ageIn = scanner.nextLine();

            inputs.add(new Book(userIn,Integer.valueOf(ageIn)));
        }

        System.out.println(inputs.size() + " books in total." + "\n\nBooks:");
        Comparator<Book> comparator = Comparator
                        .comparing(Book::getAgeR)
                        .thenComparing(Book::getName);
        
        Collections.sort(inputs, comparator);

        inputs.forEach(System.out::println);
    }

}
