import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        exitLoop:
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            switch (command) {
                case "end":
                    end(command);
                    break exitLoop;
                
                case "add":
                    add(command);
                    break;

                case "search":
                    search(command);
                    break;
            
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public void add(String command) {
        if (command.equals("add")) {
            System.out.print("Word: ");
            String word = this.scanner.nextLine();

            System.out.print("Translation: ");
            String translation = this.scanner.nextLine();

            this.dictionary.add(word, translation);
        }
        
    }

    public void end(String command) {
        if (command.equals("end")) {
            System.out.println("Bye bye!");
        }
    }

    public void search(String command) {
        if (command.equals("search")) {
            System.out.print("To be translated: ");
            String toBeTranslated = this.scanner.nextLine();

            if (this.dictionary.translate(toBeTranslated) != null) {
                System.out.println("Translation: " + this.dictionary.translate(toBeTranslated));
            }else{
                System.out.println("Word " + toBeTranslated + " was not found");
            }
        }
    }
}
