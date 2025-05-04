import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList<>());   
    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word) && !this.dictionary.get(word).isEmpty()) {
            this.dictionary.get(word).removeAll(this.dictionary.get(word));
            this.dictionary.remove(word);
        }
    }
}
