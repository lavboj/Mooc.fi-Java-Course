import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList <Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            String pages = scanner.nextLine();
            if (pages.isEmpty()) {
                break;
            }
            System.out.print("Publication year: ");
            String publication = scanner.nextLine();
            if (publication.isEmpty()) {
                break;
            }

            Book book = new Book(title, Integer.valueOf(pages), Integer.valueOf(publication));
            books.add(book);
        }
        System.out.print("What information will be printed? ");
        String userIn = scanner.nextLine();
        if (userIn.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }else if (userIn.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
