
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class GradeDistribution {

    private ArrayList<Integer> grades;

    public GradeDistribution() {
        grades = new ArrayList<Integer>();
    }

    public void setGrades(int grade) {
        this.grades.add(gradeCalculate(grade));

    }

    public int gradeCalculate(int score) {
        if (score >= 0 && score <= 60) {
            if (score < 30) {
                return 0;
            } else if (score < 35) {
                return 1;
            } else if (score < 40) {
                return 2;
            } else if (score < 45) {
                return 3;
            } else if (score < 50) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    public void printStars(int numOfStars) {
        for (int i = 1; i <= numOfStars; i++) {
            System.out.print("*");
        }
    }

}
