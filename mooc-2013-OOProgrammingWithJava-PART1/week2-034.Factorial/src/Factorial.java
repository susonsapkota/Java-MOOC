
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 1;
        System.out.println("Type a number:");
        int num = Integer.parseInt(reader.nextLine());

        while (num >= 1) {
            sum *= num;
            num--;
        }
        System.out.println("Factorial is " + sum);
    }
}
