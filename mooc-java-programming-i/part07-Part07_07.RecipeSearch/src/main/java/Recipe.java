import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private int cookTime;
    private List<String> ingredient;

    public Recipe(ArrayList<String> ingredient) {
        this.name = ingredient.get(0);
        this.cookTime = Integer.valueOf(ingredient.get(1));
        this.ingredient = ingredient.subList(2, ingredient.size());
    }

    public String getName() {
        return this.name;
    }

    public int getCookTime() {
        return this.cookTime;
    }

    public List<String> getIngredients() {
        return this.ingredient;
    }

   @Override 
    public String toString() {
        return this.name + ", cooking time: " + this.cookTime + ".";
    }
}
