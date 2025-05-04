import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container first;
    private Container second;

    public UserInterface(Scanner scanner,  Container first, Container second) {
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }

    public void start(String command, int amount){
        processingCommands(command, amount);
    }

    public void processingCommands(String command, int amount) {
        if (command.equals("add")) {
            this.first.add(amount);
        }else if (command.equals("remove")) {
            this.second.remove(amount);
        }else if (command.equals("move")){
            if (this.first.contains() < amount) {
                this.second.add(this.first.contains());
                this.first.remove(amount);
            }else {
                this.second.add(amount);
                this.first.remove(amount);
            }
        }
    }
}
