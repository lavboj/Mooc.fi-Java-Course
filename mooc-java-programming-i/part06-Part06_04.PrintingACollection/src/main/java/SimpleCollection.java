
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String elementCollection = "";
        for (String element : elements) {
            elementCollection += "\n" + element;
        }

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + elementCollection;
        }
        
        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + elementCollection;
    }
    
}
