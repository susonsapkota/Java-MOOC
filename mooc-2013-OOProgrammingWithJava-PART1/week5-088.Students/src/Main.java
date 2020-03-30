
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        System.out.println("name:");
        String stuName = reader.nextLine();

        while (!stuName.isEmpty()) {
            System.out.println("studentnumber:");
            String stuNumber = reader.nextLine();

            // making new student and adding to the arraylist
            list.add(new Student(stuName, stuNumber));

            System.out.println("name:");
            stuName = reader.nextLine();
        }

        for (Student stu : list) {
            System.out.println(stu.toString());
        }

        System.out.println("Give search term:");
        String searchName = reader.nextLine();

        System.out.println("Result:");

        for (Student stu : list) {
            if (stu.getName().contains(searchName)) {
                System.out.println(stu.toString());
            }
        }

    }
}
