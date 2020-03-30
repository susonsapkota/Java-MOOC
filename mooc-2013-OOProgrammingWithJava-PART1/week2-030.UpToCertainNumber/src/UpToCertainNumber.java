
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your code here
        int counter = 1;
        System.out.println("Print till which number ?");
        int upto = Integer.parseInt(reader.nextLine());

        while (counter <= upto) {
            System.out.println(counter);
            counter++;
        }

    }
}
