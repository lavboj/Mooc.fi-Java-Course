import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processingCommand(command);
        }
    }

    public void processingCommand(String command) {
        if (command.equals("add")) {
            add();
        }else if (command.equals("list")) {
            list();
        }else if (command.equals("remove")) {
            remove();   
        }
    }

    public void add() {
        System.out.print("To add: ");
        String userIn = this.scanner.nextLine();
        if (!userIn.isEmpty()) {
            this.todoList.add(userIn);
        }
    }

    public void list() {
        todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed?: ");
        String userIn = this.scanner.nextLine();
        if (!userIn.isEmpty()) {
            this.todoList.remove(Integer.valueOf(userIn));
        }
    }


}
