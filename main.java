import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        int[] numbers = {42, 12, 7, 89, 23, 5, 19};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}