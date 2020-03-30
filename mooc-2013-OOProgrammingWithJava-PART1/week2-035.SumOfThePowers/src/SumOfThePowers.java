
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number");
        int sum = 0;
        int num = Integer.parseInt(reader.nextLine());

        while (num >= 0) {
            sum += (int) Math.pow(2, num);
            num--;
        }
        System.out.println("The result is " + sum);

    }
}
