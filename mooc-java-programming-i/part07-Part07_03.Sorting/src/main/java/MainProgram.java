import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int smallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            if (smallestFrom(array, startIndex) == array[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holder;
        holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i)); 
        }
    }

    

}
