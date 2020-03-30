
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int counter = 0;
        int until = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while (counter <= until) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum is " + sum);
    }
}
