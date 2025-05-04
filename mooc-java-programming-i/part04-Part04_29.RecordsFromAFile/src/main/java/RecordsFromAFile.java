
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileRead = new Scanner(Paths.get(file))) {
            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                String [] parts = line.split(","); 

                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                System.out.print(name + ", age: " + age);
                if(age == 1)
                    System.out.println(" year");
                else
                    System.out.println(" years");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
