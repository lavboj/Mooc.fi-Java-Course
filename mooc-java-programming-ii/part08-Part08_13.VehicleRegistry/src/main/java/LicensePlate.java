
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass() || obj == null) {
            return false;
        }

        LicensePlate compared = (LicensePlate) obj;

        if (this.toString().equals(compared.toString())) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
