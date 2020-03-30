
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Type numbers:");
        int num = Integer.parseInt(reader.nextLine());

        while (num != -1) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            counter++;
            sum += num;
            //running the loop again
            num = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        double result = (double) sum / counter;
        System.out.println("Average:" + result);
        System.out.println("Even numbers:" + evenCount);
        System.out.println("Odd numbers:" + oddCount);

    }
}
