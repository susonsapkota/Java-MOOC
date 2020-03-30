
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {

        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        int num;
        this.numbers.clear();
        while (this.numbers.size() < 7) {
            num = (1 + random.nextInt(39));
            if (!containsNumber(num)) {
                this.numbers.add(num);
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);

    }
}
