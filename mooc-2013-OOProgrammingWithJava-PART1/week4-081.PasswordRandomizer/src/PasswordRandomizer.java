
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int lenght;
    private String password;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lenght = length;

    }

    public String createPassword() {
        // write code that returns a randomized password
        this.password = "";
        Random random = new Random();
        int counter = 1;
        while (counter <= this.lenght) {
            this.password += "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            counter++;
        }
        return this.password;
    }
}
