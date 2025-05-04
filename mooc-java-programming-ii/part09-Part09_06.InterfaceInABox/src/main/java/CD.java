public class CD implements Packable{
    private double weight;
    private String artist;
    private String name;
    private int publicYear;

    public CD(String artist, String name, int publicYear) {
        this.artist = artist;
        this.name = name;
        this.publicYear = publicYear;
        this.weight = 0.1;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicYear + ")";
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
