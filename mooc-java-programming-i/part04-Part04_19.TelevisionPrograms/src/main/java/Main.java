import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String nameIn = scanner.nextLine();
            if (nameIn.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            String durationIn = scanner.nextLine();
            if (durationIn.isEmpty()) {
                break;
            }
            TelevisionProgram tvEntities = new TelevisionProgram(nameIn, Integer.valueOf(durationIn));
            programs.add(tvEntities);

        }
        System.out.print("Program's maximum duration? ");
        int maxDurationIn = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram televisionProgram : programs) {
            if (televisionProgram.getDuration() <= maxDurationIn) {
                System.out.println(televisionProgram.getName() + ", " + televisionProgram.getDuration() + " minutes" );
            }
        }

    }
}
