public class Book implements Comparable<Book>{
    private String name;
    private int ageR;

    public Book(String name, int ageR) {
        this.name = name;
        this.ageR = ageR;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeR() {
        return this.ageR;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageR + " year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        return this.getAgeR() - o.getAgeR();
    }
}
