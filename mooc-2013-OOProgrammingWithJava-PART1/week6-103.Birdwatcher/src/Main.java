
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        ArrayList<Bird> list = new ArrayList<Bird>();
        System.out.println("?");
        String input = reader.nextLine();

        while (!input.equalsIgnoreCase("Quit")) {

            if (input.equalsIgnoreCase("Add")) {
                
                
                System.out.println("Name:");
                String birdName = reader.nextLine();
                System.out.println("Latin Name:");
                String birdLatinName = reader.nextLine();
                
                list.add(new Bird(birdName, birdLatinName));
            } else if (input.equalsIgnoreCase("Observation")) {
                
                System.out.println("What was observed:? ");
                String birdName = reader.nextLine();
                
                boolean check = false;
                
                for (Bird b : list) {
                    if (b.getName().equalsIgnoreCase(birdName) || b.getLatinName().equalsIgnoreCase(birdName)) {
                        b.wasObserved();
                        check = true;
                    }
                }
                
                if (!check) {
                    System.out.println("Is not a bird!");
                }
                
            } else if (input.equalsIgnoreCase("Statistics")) {
                for (Bird b : list) {
                    System.out.println(b.toString());
                }
            } else if (input.equalsIgnoreCase("Show")) {
                System.out.println("What?");
                String birdName = reader.nextLine();
                for (Bird b : list) {
                    if (b.getName().equalsIgnoreCase(birdName) || b.getLatinName().equalsIgnoreCase(birdName)) {
                        System.out.println(b.toString());
                    }
                }
            } else if (input.equalsIgnoreCase("ShowAll")) {
                for (Bird b : list) {
                    System.out.println(b.toString());
                }
            }
            System.out.println("?");
            input = reader.nextLine();

        }
    }

}
