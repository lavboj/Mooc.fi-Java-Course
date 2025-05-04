
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int userIn = Integer.valueOf(scanner.nextLine());
            if (userIn == -1) {
                break;
            }
            if (userIn > -1 && userIn < 101) {
                points.add(userIn);
            }
        }

        System.out.println("Point average (all): " + average(points));
        System.out.println("Point average (passing): " + averagePassing(points));
        System.out.println("Pass percentage: " + passPercentage(points));
        gradeDistribution(points);

    }

    public static double average(ArrayList<Integer> points) {
        int total = 0;
        for (Integer integer : points) {
            total += integer;
        }
        return (double) total / points.size();
    }

    public static String averagePassing(ArrayList<Integer> points) {
        int total = 0;
        int counter = 0;
        for (Integer integer : points) {
            if (integer > 49) {
                total += integer;
                counter++;
            }
        }
        if (counter == 0) {
            return "-";
        }
        return "" + (double) total / counter;
    }

    public static double passPercentage(ArrayList<Integer> points) {
        int passing = 0;
        for (Integer integer : points) {
            if (integer > 49) {
                passing++;
            }
        }
        return (double) 100 * passing / points.size();
    }

    public static void starsPrint(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.print("*");
        }
    }

    public static int quantityGrades(ArrayList<Integer> points, int grade) {
        int quantity = 0;
        if (grade == 5) {
            for (Integer integer : points) {
                if (integer >= 90) {
                    quantity++;
                }
            }
            return quantity;

        }else if (grade == 4) {
            for (Integer integer : points) {
                if (integer < 90 && integer > 79) {
                    quantity++;
                }
            }
            return quantity;

        }else if (grade == 3) {
            for (Integer integer : points) {
                if (integer < 80 && integer > 69) {
                    quantity++;
                }
            }
            return quantity;

        }else if (grade == 2) {
            for (Integer integer : points) {
                if (integer < 70 && integer > 59) {
                    quantity++;
                }
            }
            return quantity;

        }else if (grade == 1) {
            for (Integer integer : points) {
                if (integer < 60 && integer > 49) {
                    quantity++;
                }
            }
            return quantity;

        }else if (grade == 0) {
            for (Integer integer : points) {
                if (integer < 50) {
                    quantity++;
                }
            }
            return quantity;

        }else
            return 0;
    }

    public static void gradeDistribution(ArrayList<Integer> points) {
        System.out.print("5: ");
        starsPrint(quantityGrades(points, 5));
        System.out.print("\n4: ");
        starsPrint(quantityGrades(points, 4));
        System.out.print("\n3: ");
        starsPrint(quantityGrades(points, 3));
        System.out.print("\n2: ");
        starsPrint(quantityGrades(points, 2));
        System.out.print("\n1: ");
        starsPrint(quantityGrades(points, 1));
        System.out.print("\n0: ");
        starsPrint(quantityGrades(points, 0));
        System.out.println();
    }
}
