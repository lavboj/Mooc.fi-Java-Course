
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftIn = Integer.valueOf(scan.nextLine());

        if (giftIn > 1000000) {
            System.out.println("Tax: " + (142100 + (giftIn - 1000000) * 0.17));
        }else if (giftIn > 200000 && giftIn <= 1000000) {
            System.out.println("Tax: " + (22100 + (giftIn - 200000) * 0.15));
        }else if (giftIn > 55000 && giftIn <= 200000) {
            System.out.println("Tax: " + (4700 + (giftIn - 55000) * 0.12));
        }else if (giftIn > 25000 && giftIn <= 55000) {
            System.out.println("Tax: " + (1700 + (giftIn - 25000) * 0.10));
        }else if (giftIn >= 5000 && giftIn <= 25000) {
            System.out.println("Tax: " + (100 + (giftIn - 5000) * 0.08));
        }else{
            System.out.println("No tax!");
        }

    }
}
