
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        String inputWord = reader.nextLine();
        while (!inputWord.isEmpty()) {
            words.add(inputWord);
            System.out.println("Type a word: ");
            inputWord = reader.nextLine();
        }
        Collections.reverse(words);
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
