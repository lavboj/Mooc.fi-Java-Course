public class Person {
    private String nameSurname;
    private String adress;

    public Person(String nameSurname, String adress) {
        this.nameSurname = nameSurname;
        this.adress = adress;
    }

   @Override 
    public String toString() {
        return this.nameSurname + "\n  " + this.adress;
    }
}
