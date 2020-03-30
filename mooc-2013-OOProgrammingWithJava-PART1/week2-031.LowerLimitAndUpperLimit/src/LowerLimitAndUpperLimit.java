
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("Lower Limit ?");
        int lower = Integer.parseInt(reader.nextLine());

        System.out.println("Upper Limit ?");
        int upper = Integer.parseInt(reader.nextLine());
        if (!(lower > upper)) {
            while (lower <= upper) {
                System.out.println(lower);
                lower++;
            }
        }
    }
}
