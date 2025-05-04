public class Teacher extends Person {
    private int salary;

    public Teacher(String nameSurname, String adress, int salary) {
        super(nameSurname, adress);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
}
