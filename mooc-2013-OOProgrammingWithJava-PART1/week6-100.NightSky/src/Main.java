
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky nightSky = new NightSky(0.9, 40, 1);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());

    }
}
