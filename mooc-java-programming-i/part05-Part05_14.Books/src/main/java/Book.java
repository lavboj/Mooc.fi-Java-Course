
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }else if (!(compare instanceof Book)) {
            return false;
        }

        Book compared = (Book) compare;

        if (this.name.equals(compared.name) &&
            this.publicationYear == compared.publicationYear) {
            return true;
        }

        return false;
    }

}
