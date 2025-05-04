import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        msFactory.createMagicSquare(15);
        msFactory.print();
    }
}
