
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");

        System.out.println("Top ten by penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");

        System.out.println("Sidney Crosby statistics:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");

        System.out.println("Statistics for Philadelphia Flyers :");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("");

        System.out.println("Players of Anaheim Ducks:");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();

        System.out.println("");

    }
}
