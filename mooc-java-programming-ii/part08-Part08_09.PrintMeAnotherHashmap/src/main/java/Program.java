
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
    }

    public static void printValues(HashMap<String,Book> hashMap) {
        for (Book value : hashMap.values()) {
            System.out.println(value.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashMap, String text) {
        for (Book value : hashMap.values()) {
            if (value.getName().contains(text)) {
                System.out.println(value.toString());
            }
        }
    }

}
