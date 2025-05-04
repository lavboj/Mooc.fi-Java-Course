import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegistry {
    private HashMap <LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }


    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.owners.containsKey(licensePlate)) {
            return false;
        }
        this.owners.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.owners.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.owners.containsKey(licensePlate)) {
            this.owners.remove(licensePlate);
            return true; 
        }
        return false; 
    }

    public void printLicensePlates() {
        for (LicensePlate plate : owners.keySet()) {
            System.out.println(plate.toString());
        }
    }

    public void printOwners() {
        List<String> listOwners = new ArrayList<>();
        for (String owner : owners.values()) {
            if (!listOwners.contains(owner)) {
                System.out.println(owner.toString());   
                listOwners.add(owner);
            }
        }
    }
}
