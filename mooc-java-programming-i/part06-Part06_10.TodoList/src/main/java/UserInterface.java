import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                System.out.println("Bye bye!");
                break;
            }
            processingCommand(command);
        }
    }

    public void processingCommand(String command) {
        if (command.equals("list")) {
            list();

        }else if (command.equals("remove")) {
            remove();

        }else if (command.equals("add")) {
            add();
        }else {
            System.out.println("Uknown command");
        }
    }

    public void list() {
        this.todoList.print();
    }

    public void add() {
        System.out.print("To add: ");
        String command = this.scanner.nextLine();
        if (!command.isEmpty()) {
            todoList.add(command);
        }
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int command = Integer.valueOf(this.scanner.nextLine());
        if (command > 0) {
            todoList.remove(command);
        }
    }
}
