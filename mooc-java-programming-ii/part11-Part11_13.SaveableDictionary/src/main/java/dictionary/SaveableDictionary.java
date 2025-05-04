package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.fileName))){
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
                
                this.dictionary.putIfAbsent(parts[0], parts[1]);
                this.dictionary.putIfAbsent(parts[1], parts[0]);
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.fileName)) {
            Set<String> printedPairs = new HashSet<>();

            for (String word : this.dictionary.keySet()) {
                String pair = word.compareTo(this.dictionary.get(word)) < 0
                            ? word + ":" + this.dictionary.get(word)
                            : this.dictionary.get(word) + ":" + word;
                
                if (printedPairs.add(pair)) {
                    writer.println(pair);
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
        this.dictionary.putIfAbsent(translation, word);
    }

    public void delete(String word) {
        this.dictionary.remove(this.dictionary.get(word));
        this.dictionary.remove(word);
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }
}
