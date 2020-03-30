
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        if (!this.guessedLetters.contains(letter)) {
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            } else {
                this.guessedLetters += letter;
            }
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        int counter = 0;
        String hiddenLetter = "";
        while (counter < this.word.length()) {
            if (this.guessedLetters.contains(Character.toString(this.word.charAt(counter)))) {
                hiddenLetter += this.word.charAt(counter);
            } else {
                hiddenLetter += "_";
            }
            counter++;
        }
        return hiddenLetter;
    }
}
