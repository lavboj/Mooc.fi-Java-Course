
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }else if (!(compare instanceof Person)) {
            return false;
        }

        Person compared = (Person) compare;

        if (this.name.equals(compared.name) &&
            this.birthday.equals(compared.birthday) &&
            this.height == compared.height &&
            this.weight == compared.weight) {
            return true;
        }
        
        return false;
    }
}
