
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        // write the code here
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int small = smallest(array);
        int index = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == small) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallest = array[index];
        int smallIndex = index;
        for (int i = index; i <= array.length - 1; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        //  bbble sort 
        for (int i = 0; i < array.length - 1; i++) {
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, index, i);
            System.out.println(Arrays.toString(array));
        }

    }

}
