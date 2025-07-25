
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            if (lastName.isEmpty()) {
                break;
            }
            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();
            if (idNumber.isEmpty()) {
                break;
            }

            PersonalInformation entity = new PersonalInformation(firstName, lastName, idNumber);
            infoCollection.add(entity);
        }
        System.out.println("");
        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }

    }
}
