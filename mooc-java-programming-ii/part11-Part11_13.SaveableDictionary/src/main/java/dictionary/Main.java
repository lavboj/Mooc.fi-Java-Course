package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary s = new SaveableDictionary("word.txt");
        s.add("tietokone", "computer");
        s.load();
        s.save();
        System.out.println(s.save());
    }
}
