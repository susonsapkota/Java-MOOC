
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number:");
        float firstNum = reader.nextFloat();
        System.out.println("Type another number:");
        float secondNum = reader.nextFloat();
        float result = firstNum / secondNum;
        System.out.println("Division: " + firstNum + " / " + secondNum + " = " + result);
    }
}
