
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        VehicleRegistry vr = new VehicleRegistry(); 
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        System.out.println( vr.add( new LicensePlate("FI", "AAA-111"), "Arto"));
        System.out.println( vr.add( new LicensePlate("FI", "AAA-111"), "Arto"));
        System.out.println( vr.add( new LicensePlate("FI", "AAA-111"), "Pekka"));
        System.out.println( vr.add( new LicensePlate("FI", "AAA-111"), "Arto"));
        System.out.println( vr.add( new LicensePlate("FI", "AAA-111"), "Arto"));
    }
}
