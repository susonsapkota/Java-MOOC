
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String InputWord = reader.nextLine();
        while (!InputWord.isEmpty()) {
            words.add(InputWord);
            System.out.println("Type a word: ");
            InputWord = reader.nextLine();
        }
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
