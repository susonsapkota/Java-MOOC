
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        doSomething(reader);
    }

    public static void doSomething(Scanner scanner) {
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        System.out.println("Type exam scores, -1 completes: ");
        int score = Integer.parseInt(scanner.nextLine());
        while (score != -1) {
            if (score >= 0 && score <= 60) {
                if (score < 30) {
                    grade0++;
                } else if (score < 35) {
                    grade1++;
                } else if (score < 40) {
                    grade2++;
                } else if (score < 45) {
                    grade3++;
                } else if (score < 50) {
                    grade4++;
                } else {
                    grade5++;
                }
            }
            score = Integer.parseInt(scanner.nextLine());

        }
        int passed = grade1 + grade2 + grade3 + grade4 + grade5;
       
        int failed = grade0;
        int total = passed + failed;
        float perc = (((float) passed / total) * 100);
        System.out.println("Grade distribution:");

        System.out.print("5:");
        while (grade5 > 0) {
            System.out.print("*");
            grade5--;
        }
        System.out.println("");
        System.out.print("4:");
        while (grade4 > 0) {
            System.out.print("*");
            grade4--;
        }
        System.out.println("");
        System.out.print("3:");
        while (grade3 > 0) {
            System.out.print("*");
            grade3--;
        }
        System.out.println("");
        System.out.print("2:");
        while (grade2 > 0) {
            System.out.print("*");
            grade2--;
        }
        System.out.println("");
        System.out.print("1:");
        while (grade1 > 0) {
            System.out.print("*");
            grade1--;
        }
        System.out.println("");
        System.out.print("0:");
        while (grade0 > 0) {
            System.out.print("*");
            grade0--;
        }
        System.out.println("");

        System.out.println("Acceptance percentage: " + perc);

    }

}
