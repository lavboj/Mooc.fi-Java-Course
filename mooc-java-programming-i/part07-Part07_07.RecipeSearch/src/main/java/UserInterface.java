import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private String fileName;
    private ArrayList<Recipe> recipies;

    public UserInterface(String fileName, Scanner scanner) {
        this.fileName = fileName;
        this.recipies = new ArrayList<>();
        this.scanner = scanner;
    }

    public void start() {
        readFile();
        System.out.println("\nCommands:\nlist - lists the recipes\nstop - stops the program\n"
                            + "find name - searches recipes by name\nfind cooking time - searches recipes by cooking time\n"
                            + "find ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processingCommand(command);
        }
    }

    public void readFile() {
        try (Scanner filePath = new Scanner(Paths.get(this.fileName))) {
            ArrayList<String> lines = new ArrayList<>();
            while (filePath.hasNextLine()) {
                String line = filePath.nextLine();
                if (!line.equals("")) {
                    lines.add(line);
                }
                if (line.equals("") || !filePath.hasNextLine()) {
                    addRecipe(new Recipe(lines));
                    lines = new ArrayList<>();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void processingCommand(String command) {
        if (command.equals("list")) {
            list();
        }else if (command.equals("find name")) {
            findName();
        }else if (command.equals("find cooking time")) {
            findCookTime();
        }else if (command.equals("find ingredient")) {
            findIngredient();
        }
    }

    public void addRecipe(Recipe recipe) {
        this.recipies.add(recipe);
    }

    public void list() {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipies) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
        }
        System.out.println();
    }

    public void list(String word) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipies) {
            if (recipe.getName().toLowerCase().contains(word.toLowerCase())) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
        System.out.println();
    }

    public void list(int cookTime) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipies) {
            if (recipe.getCookTime() <= cookTime) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
        System.out.println();
    }

    public void listIngredients(String word) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipies) {
            for (String ingredient : recipe.getIngredients()) {
                if (ingredient.equalsIgnoreCase(word)) {
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
                }
            }
        }
        System.out.println();
    }

    public void findName() {
        System.out.print("Searched word: ");
        String word = this.scanner.nextLine();
        list(word);
    }

    public void findCookTime() {
        System.out.print("Max cooking time: ");
        int cookTime = Integer.valueOf(this.scanner.nextLine());
        list(cookTime);
    }

    public void findIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = this.scanner.nextLine();
        listIngredients(ingredient);
    }

}
