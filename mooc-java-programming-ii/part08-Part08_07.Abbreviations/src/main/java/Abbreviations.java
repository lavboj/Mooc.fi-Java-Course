import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> list;
    
    public Abbreviations() {
        this.list = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (!hasAbbreviation(abbreviation)) {
            this.list.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.list.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return this.list.get(abbreviation);   
        }else
            return null;
    }
}
