
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> word = new ArrayList<String>();
        System.out.println("Type a word: ");
        String inputWord = reader.nextLine();

        while (!word.contains(inputWord)) {
            word.add(inputWord);
            inputWord = reader.nextLine();
        }
        System.out.println("You gave the word " + inputWord + " twice");
    }
}
