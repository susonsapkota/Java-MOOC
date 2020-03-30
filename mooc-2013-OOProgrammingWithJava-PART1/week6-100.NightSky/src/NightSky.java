
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public void printLine() {
        Random random = new Random();
        double star = random.nextDouble();
        double space = 1 - star;
        int[] arr = new int[this.width];
        for (int i = 0; i < this.width; i++) {
            if (this.density <= star) {
                arr[i] = 1; // blank 
            } else {
                arr[i] = 0; // star
                this.starsInLastPrint++;

            }
            star = random.nextDouble();
        }
        for (int a : arr) {
            if (a == 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");

            }
        }
        System.out.println("");

    }

    public void print() {
        for (int i = 0; i < this.height; i++) {
            this.printLine();
        }
    }

    public int starsInLastPrint() {
        int temp = starsInLastPrint;
        starsInLastPrint = 0;
        return temp;

    }
}
