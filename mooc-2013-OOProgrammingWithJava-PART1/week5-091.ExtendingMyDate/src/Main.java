
public class Main {

    public static void main(String[] args) {
        // test your code here
        MyDate date = new MyDate(29, 12, 10);
        date.advance();
        System.out.println(date.toString());
        date.advance();
        System.out.println(date.toString());
    }
}
