
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.println("Type the password:");
            String test = reader.nextLine();
            if (test.equals(password)) {
                System.out.println("Right!");
                System.out.println("There is nothing secrect in life, secrect is you who wills to fine one.");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
