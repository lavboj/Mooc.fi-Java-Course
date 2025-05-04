public class Book {
    private String title;
    private int pages;
    private int pYear;

    public Book(String title, int pages, int pYear) {
        this.title = title;
        this.pages = pages;
        this.pYear = pYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.pYear;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.pYear;
    }
}
