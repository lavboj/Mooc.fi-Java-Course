public class Book implements Packable{
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }

    @Override
    public double weight() {
        return this.weight;
    }

}
