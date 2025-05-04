import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birdList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdList = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            processingCommands(command);
        }
    }

    public void processingCommands(String command) {
        if (command.equals("Add")) {
            System.out.print("Name: ");
            String name = this.scanner.nextLine();
            System.out.print("Name in Latin: ");
            String nameLatin = this.scanner.nextLine();
            
            if (!name.isEmpty() && !nameLatin.isEmpty()) {
                add(name, nameLatin);
            }

        }else if (command.equals("Observation")) {
            System.out.print("Bird? ");
            String bird = this.scanner.nextLine();

            if (!bird.isEmpty()) {
                observation(bird);
            }

        }else if (command.equals("All")) {
            all();

        }else if (command.equals("One")) {
            System.out.print("Bird? ");
            String bird = this.scanner.nextLine();
            
            if (!bird.isEmpty()) {
                one(bird);
            }
        }
    }

    public void add(String name, String nameLatin) {
                birdList.add(new Bird(name, nameLatin));
    }

    public void observation(String specie) {
        boolean checkSpecie = false;
        for (Bird bird : birdList) {
            if (bird.getName().equals(specie)) {
                bird.gainObservation();
                checkSpecie = true;
            }
        }
        if (!checkSpecie) {
            System.out.println("Not a bird!");
        }
    }

    public void all() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    public void one(String printBird) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(printBird)) {
                System.out.println(bird.toString());
            }
        }
    }
}
