
public class Program {

    public static void main(String[] args) {
        // main program
        Die die = new Die(12);

        for (int i = 0; i < 1000; i++) {
            System.out.println(die.throwDie());
        }

    }
}
