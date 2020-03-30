
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int counter = 1;
        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int numberGuessed = Integer.parseInt(reader.nextLine());
        while (true) {

            if (numberGuessed < numberDrawn) {
                System.out.println("The number is greater, guesses made:" + counter);
                counter++;
                numberGuessed = Integer.parseInt(reader.nextLine());
            } else if (numberGuessed > numberDrawn) {
                System.out.println("The number is lesser guesses made:" + counter);
                numberGuessed = Integer.parseInt(reader.nextLine());
                counter++;
            } else if (numberGuessed == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
