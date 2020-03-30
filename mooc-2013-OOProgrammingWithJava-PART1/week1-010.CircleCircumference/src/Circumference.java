
import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius:");
        float radius = reader.nextFloat();
        double circumference = Math.PI * radius * 2;
        System.out.println("Circumference of the circle: " + circumference);

    }
}
