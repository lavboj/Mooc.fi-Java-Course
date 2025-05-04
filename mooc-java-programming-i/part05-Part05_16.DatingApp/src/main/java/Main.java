
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate data = new SimpleDate(1, 1, 1);

        data.advance(365);

        System.out.println(data);
    }
}
