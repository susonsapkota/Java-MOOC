
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here

        int[] original = {1, 2, 3, 4};
        int[] copied = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

    }

    public static int[] copy(int[] array) {
        int[] newArr = new int[array.length];

//        arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
//
//        Parameters
//                src − This is the source array.
//
//                srcPos − This is the starting position in the source array.
//
//                dest − This is the destination array.
//
//                destPos − This is the starting position in the destination data.
//
//                length − This is the number of array elements to be copied.
//        basically equals to - for loop, which copy the value indivivdually form one to another variable as shown below
//          in reverseCopy().
        System.arraycopy(array, 0, newArr, 0, array.length);
        return newArr;
    }

    public static int[] reverseCopy(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = array[array.length - i - 1];
        }
        return newArr;

    }

}
