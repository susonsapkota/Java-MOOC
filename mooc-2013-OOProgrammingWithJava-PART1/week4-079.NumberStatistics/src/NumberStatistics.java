
public class NumberStatistics {

    private int amountOfNumbers;
    private int addedNumbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.addedNumbers += number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }

    public int sum() {
        // code here
        if (amountOfNumbers() > 0) {
            return this.addedNumbers;
        } else {
            return 0;
        }
    }

    public double average() {
        // code here
        if (amountOfNumbers() > 0) {
            return (double) sum() / amountOfNumbers();
        } else {
            return 0;
        }

    }
}
